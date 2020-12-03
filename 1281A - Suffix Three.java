import java.io.*;
import java.util.*;
 
public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while(t-->0) {
                String s = br.readLine();
                int n = s.length();
                if(n>=5 && s.substring(n-5).equals("mnida")) {
                    System.out.println("KOREAN");
                }else if(n>=4 && (s.substring(n-4).equals("desu") || s.substring(n-4).equals("masu"))) {
                    System.out.println("JAPANESE");
                }else {
                    System.out.println("FILIPINO");
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}