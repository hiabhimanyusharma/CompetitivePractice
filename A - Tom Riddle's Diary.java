import java.io.*;
import java.util.*;
 
public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            Set<String> s = new HashSet<>();
            for(int i=0;i<n;i++) {
                String name = br.readLine();
                if(s.contains(name)) System.out.println("YES");
                else {
                    System.out.println("NO");
                    s.add(name);
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}