import java.io.*;
import java.util.*;
 
public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(br.readLine());
            while(t-->0) {
                String[] s = br.readLine().trim().split(" ");
                int x=Integer.parseInt(s[0]),y=Integer.parseInt(s[1]),z=Integer.parseInt(s[2]);
                //x = max(a,b),y = max(a,c),z = max(b,c)
                if((x==y && z<=x)){
                    System.out.println("YES");
                    int a=x,b=z,c=z;
                    System.out.println(a +" " + b + " " + c);
                }else if(x==z && y<=x) {
                    System.out.println("YES");
                    int a=y,b=x,c=y;
                    System.out.println(a +" " + b + " " + c);
                }else if(z==y && x<=z) {
                    System.out.println("YES");
                    int a=x,b=x,c=y;
                    System.out.println(a +" " + b + " " + c);
                }else {
                    System.out.println("NO");
                }
            }
        } catch (Exception e) {
            return;
        }
    }
}