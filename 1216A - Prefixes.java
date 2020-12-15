import java.io.*;
import java.util.*;

public class some1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            StringBuilder ans = new StringBuilder();
            int match = 0,change=0;
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i)=='a') match+=1;
                else match-=1;

                if(i%2==1) {
                    if(match==0) {
                        ans.append(s.charAt(i-1));
                        ans.append(s.charAt(i));
                    }
                    else if(match<0) {
                        change++;
                        ans.append(s.substring(i-1,i));
                        ans.append('a');
                    }else {
                        change++;
                        ans.append(s.substring(i-1,i));
                        ans.append('b');
                    }
                    match=0;
                }
            }
            System.out.println(change);
            System.out.println(ans);
        } catch (Exception e) {
            return;
        }
    }
}