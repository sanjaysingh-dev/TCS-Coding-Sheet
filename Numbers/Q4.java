// Problem Statement: Given two integers a and b, find prime numbers in a given range [a,b], (a and b are included here).

package Numbers;
import java.util.*;

public class Q4{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i=A;i<=B;i++){

          int factor=0;

          for(int j=1;j<=i;j++){
          if(i%j==0)
           factor++;
           }

        if(factor==2)
         System.out.print(i+" ");
        }

      sc.close();   
    }
}