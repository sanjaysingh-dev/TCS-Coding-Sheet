// Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

package Numbers;
import java.util.*;

public class Q24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        int min = Math.min(N1,N2);
        int gcd = 0;

        for(int i=min;i>=1;i--){
            if(N1%i==0 && N2%i==0){
                gcd = i;
                break;
            }
        }

        System.out.println("GCD: "+gcd);
        sc.close();
    } 
}
