import java.io.*;
import java.util.*;

public class some {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            int a=1;
            for(int i=2;i<=n;i++) {
                a += (i%2==0)? 2:1;
            }
            System.out.println(a);
        } catch (Exception e) {
            return;
        }
    }
}

//optimized solution

//import java.io.*;
//import java.util.*;

//public class some {
//    public static void main(String[] args) {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            int n = Integer.parseInt(br.readLine());
//            System.out.println((n/2)*3);
//        } catch (Exception e) {
//            return;
//        }
//    }
//}