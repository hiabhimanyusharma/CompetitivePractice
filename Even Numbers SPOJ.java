import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while(t-->0) {
                int n = Integer.parseInt(br.readLine());
                if(n%2==0) {
                    int rev = 0;
                    int x =(int)(Math.log(n)/Math.log(2))+1;
                    for(int i=x-1;i>=0;i--) {
                        rev += (n&1)<<i;
                        n = n>>1;
                    }
                    System.out.println(rev);
                }else System.out.println(n);
            }
        } catch (Exception e) {
            return;
        }
    }
}