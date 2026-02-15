// Problem Statement: Given a number N, return all primes till N.

package Numbers;
import java.util.*;

public class Q19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        System.out.println(N+" raised to the power "+X+" is "+(int)Math.pow(N,X));
        
        sc.close();
    }    
}
