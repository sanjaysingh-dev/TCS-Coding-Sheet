// Problem Statement: Given a range of numbers, find all the palindrome numbers in the range.

package Numbers;
import java.util.*;

public class Q2{

   static boolean palindrome(int A){

          if(A<0)
           return false;

            int original = A;
            int reverse = 0 ;

            while(A>0){
                int digit =A%10;
                reverse = reverse*10+digit;
                A=A/10;
            }

          return (reverse==original);
   }


   public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        int min = sc.nextInt();
        int max = sc.nextInt();

        for(int i=min;i<=max;i++){
            if(palindrome(i)==true)
                System.out.print(i+" ");
        }

        sc.close();
   } 
}