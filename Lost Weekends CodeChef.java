import java.util.*;

import java.lang.*;

import java.io.*;

class Codechef {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while(t-->0) {
                String s[] = br.readLine().trim().split(" ");
                int totalTime = 24*5;
                for(int i=0;i<5;i++) {
                    totalTime-= (Integer.parseInt(s[i])*Integer.parseInt(s[5]));
                }
                System.out.println((totalTime<0)?"Yes":"No");
            }
        } catch (Exception e) {
            return;
        }
    }
}