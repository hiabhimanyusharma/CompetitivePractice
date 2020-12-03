import java.io.*;
import java.util.*;
 
public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            boolean[] primes = new boolean[n+1];
            primes[0] = true;
            primes[1] = true;
            for(int i=2;i<=Math.sqrt(n);i++) {
                int j=2;
                while(i*j<=n) {
                    primes[i*j] = true;
                    j++;
                }
            }
            int count = 0;
            for(int i=6;i<=n;i++) {
                int trys = 0;
                int tem = i;
                for(int j=2;j<=n;j++) {
                    if(!primes[j] && tem%j==0) {
                        while(tem%j==0) tem/=j;
                        trys++;
                    }
                    if(trys==2) break;
                }
                if(trys==2 && tem==1) count++;
            }
            System.out.println(count);
        } catch (Exception e) {
            return;
        }
    }
}