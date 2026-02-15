// Problem Statement: Given an integer N, print all of its prime factors.

package Numbers;
import java.util.*;

public class Q21{

    static boolean isPrime(int N){
        
        int fact = 0;

        for(int i=1;i<=N;i++){
            if(N%i==0)
                fact++;
           }
           
      return (fact==2);     
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=1;i<=N;i++){
            if(N%i==0){
                if(isPrime(i))
                System.out.print(i+" ");
        }
    sc.close();
    }
 }
}
