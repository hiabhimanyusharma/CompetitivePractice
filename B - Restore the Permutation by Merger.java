import java.io.*;
import java.util.*;
 
public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while(t-->0) {
                int n = Integer.parseInt(br.readLine());
                String s[] = br.readLine().trim().split(" ");
                int[] a = new int[n*2];
                boolean[] b = new boolean[n*2];
                for(int i=0;i<n*2;i++) {
                    a[i] = Integer.parseInt(s[i]);
                    if(!b[a[i]-1]) {
                        System.out.print(a[i] + " ");
                        b[a[i]-1] = true;
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            return;
        }
    }
}