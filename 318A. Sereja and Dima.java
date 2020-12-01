import java.io.*;
import java.util.*;
 
public class test{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i]=Integer.parseInt(s[i]);
            int i=0,j=n-1;
            int Sereja=0,Dimas=0;
            boolean turn1 = true;
            while(i<=j) {
                int toAdd = 0;
                if(a[i]>a[j]) {
                    toAdd = a[i];
                    i++;
                }else {
                    toAdd = a[j];
                    j--;
                }
 
                if(turn1) Sereja+=toAdd;
                else Dimas+=toAdd;
 
                turn1=!turn1;
            }
 
            System.out.println(Sereja + " " + Dimas);
        } catch (Exception e) {
            return;
        }
    }
}