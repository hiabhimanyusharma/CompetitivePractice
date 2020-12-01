import java.io.*;
import java.util.*;

public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            String s1[] = br.readLine().trim().split(" ");
            String s2[] = br.readLine().trim().split(" ");
            int q = Integer.parseInt(br.readLine());
            for(int i=0;i<q;i++) {
                int num = Integer.parseInt(br.readLine());
                int nq = num%n;
                int mq = num%m;
                StringBuilder sb = new StringBuilder();
                sb.append((nq==0)? s1[n-1]:s1[nq-1]);
                sb.append((mq==0)? s2[m-1]:s2[mq-1]);
                System.out.println(sb.toString());
            }
        } catch (Exception e) {
            return;
        }
    }
}

