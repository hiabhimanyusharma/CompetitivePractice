import java.io.*;
import java.util.*;

public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while(t-->0) {
                int n = Integer.parseInt(br.readLine());
                System.out.println((n%2==0) ? n/2:(n/2)+1);
            }
        } catch (Exception e) {
            return;
        }
    }
}