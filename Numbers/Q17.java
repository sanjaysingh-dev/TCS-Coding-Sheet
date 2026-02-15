// Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

package Numbers;
import java.util.*;

public class Q17 {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = 0;
        int B = 1;

        if(N <= 0)
            System.out.println("Invalid input");
        
        else if(N == 1)
            System.out.print(A);
        
        else{

       System.out.print(A+" "+B+" ");

       for(int i=3;i<=N;i++){
        int C = A+B;
        System.out.print(C+" ");
        A=B;
        B=C;
        }
      }
     sc.close();
    }
}
