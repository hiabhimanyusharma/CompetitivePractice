import java.io.*;
import java.util.*;

class Practice{
    static class Graph {
        HashMap<Integer,List<Integer>> m;
        int n;
        public int len=0;
        boolean[] v;
        Graph(int n) {
            this.n = n;
            m = new HashMap<>();
            v = new boolean[n+1];
        }
        
        public void addNode(int to,int val) {
            List<Integer> l;
            if(m.containsKey(to)) l = m.get(to);
            else l = new ArrayList<>();
            
            l.add(val);
            m.put(to,l);
    
            return;
        }
    
        public void bfs() {
            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            while(!q.isEmpty()) {
                int s = q.size();
                for(int i=0;i<s;i++) {
                    int tem = q.remove();
                    if(m.containsKey(tem)){
                        for(int x : m.get(tem)) {
                            if(!v[x]) q.add(x);
                        }
                    }
                }
                this.len+=1;
            }
        }

        public void printlen() {
            this.bfs();
            System.out.println(this.len-1);
        }
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            Graph g = new Graph(n);
            for(int i=0;i<n;i++) {
                int to = Integer.parseInt(br.readLine());
                if(to==-1) g.addNode(0, i+1);
                else g.addNode(to, i+1);
            }
            g.printlen();
        } catch (Exception e) {
            return;
        }
    }
}