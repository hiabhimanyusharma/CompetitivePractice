import java.io.*;
import java.util.*;
 
public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String nh[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nh[0]);
            int h = Integer.parseInt(nh[1]);
            String s[] = br.readLine().trim().split(" ");
            int[] a = new int[n];
            int w = 0;
            for(int i=0;i<n;i++) {
                a[i] = Integer.parseInt(s[i]);
                if(a[i]>h) w+=2;
                else w+=1;
            }
            System.out.println(w);
        } catch (Exception e) {
            return;
        }
    }
}