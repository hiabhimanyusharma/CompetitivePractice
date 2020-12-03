import java.io.*;
import java.util.*;
 
public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().trim().split(" ");
            for(int i=0;i<n;i++) {
                if(Integer.parseInt(s[i])==1) {
                    System.out.println("HARD");
                    return;
                }
            }
            System.out.println("EASY");
        } catch (Exception e) {
            return;
        }
    }
}