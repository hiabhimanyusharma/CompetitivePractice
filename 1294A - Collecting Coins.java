import java.io.*;
import java.util.*;
 
public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while(t-->0) {
                String[] an = br.readLine().trim().split(" ");
                int[] a = new int[3];
                int max = 0;
                for(int i=0;i<3;i++) {
                    a[i] = Integer.parseInt(an[i]);
                    max = Math.max(a[i],max);
                }
                int n = Integer.parseInt(an[3]);
                for(int i=0;i<3;i++) {
                    int toAdd = max-a[i];
                    n-=toAdd;
                }
                if(n<0) System.out.println("NO");
                else System.out.println((n%3==0)?"YES":"NO");
            }
        } catch (Exception e) {
            return;
        }
    }
}