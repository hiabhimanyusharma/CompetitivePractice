import java.io.*;
import java.util.*;
 
public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int total = 0;
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            for(int i=0;i<n;i++) {
                if((Integer.parseInt(s.charAt(i)+""))%2==0) {
                    int diff = i+1;
                    total+=diff;
                }
            }
            System.out.println(total);
        } catch (Exception e) {
            return;
        }
    }
}