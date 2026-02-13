// Problem Statement: Write a program to find whether a number is a perfect number or not.

package Numbers;
import java.util.*;

public class Q6{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
       
        int sum=0;

        for(int i=1;i<N;i++){
          if(N%i==0)
           sum+=i;
        }

       if(sum==N)
        System.out.println("It is a perfect number");

       else 
        System.out.println("It is not a perfect number");  

      sc.close();   
    }
}