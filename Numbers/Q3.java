//Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2..

package Numbers;
import java.util.*;

public class Q3{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        if (N < 2) {
            System.out.println("It is not a prime number");
            return;
        }

        int factor=0;

        for(int i=1;i<=N;i++){
          if(N%i==0)
           factor++;
        }

        if(factor==2)
         System.out.println("It is a prime number");

        else
         System.out.println("It is not a prime number");

      sc.close();   
    }
}