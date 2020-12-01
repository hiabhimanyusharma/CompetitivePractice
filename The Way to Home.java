import java.io.*;
import java.util.*;
 
public class test{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            String s = br.readLine();
            int[] canReach = new int[n];
            for(int i=0;i<n;i++) canReach[i] = Integer.MAX_VALUE;
            canReach[n-1] = 0;
            for(int i=n-1;i>=0;i--) {
                  if(s.charAt(i)=='1')  {
                    for(int j=1;j<=k && i-j>=0;j++) {
                        if(s.charAt(i-j)=='1') {
                            canReach[i-j] = Math.min(canReach[i]+1,canReach[i-j]);
                        }
                    }
                }
            }
            System.out.println((canReach[0]==Integer.MAX_VALUE || canReach[0]<0) ? -1:canReach[0]);
        } catch (Exception e) {
            return;
        }
    }
}