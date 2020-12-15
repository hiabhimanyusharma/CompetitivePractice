import java.io.*;
import java.util.*;

public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while(t-->0) {
                String s = br.readLine().trim();
                StringBuilder sb = new StringBuilder();
                sb.append(s.substring(0,2));
                for(int i=2;i<s.length();i++) if(i%2!=0) sb.append(s.charAt(i));
                System.out.println(sb.toString());
            }
        } catch (Exception e) {
            return;
        }
    }
}