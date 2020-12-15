import java.io.*;
import java.util.*;

public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            String s1 = "I hate it";
            String s2 = "I love it";
            StringBuilder sb = new StringBuilder();
            sb.append(s1);
            for(int i=1;i<n;i++) {
                sb.replace(sb.length()-2,sb.length(), "that ");
                if(i%2==0) sb.append(s1);
                else sb.append(s2);
            }
            System.out.println(sb);
        } catch (Exception e) {
            return;
        }
    }
}