import java.io.*;
import java.util.*;
 
public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            boolean luckey=false;
            long n = Long.parseLong(br.readLine());
            int luck = 0;
            while(n>1) {
                long rem = n%10;
                if(rem==4 || rem==7) luck++;
                n/=10;
            }
            while(luck>1) {
                int rem = luck%10;
                if(rem==7 || rem==4) luckey=true;
                else {
                    System.out.println("NO");
                    return;
                }
                luck/=10;
            }
            System.out.println((luckey)?"YES":"NO");
        } catch (Exception e) {
            return;
        }
    }
}