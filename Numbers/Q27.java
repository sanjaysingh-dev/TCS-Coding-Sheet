// Problem Statement: Check if the number is an abundant number or not.

package Numbers;
import java.util.*;

public class Q27{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N<=1){
           System.out.println("It is not an abundant number");  
           return;
        }

        int sum = 0;
        
        for(int i=1;i<=N/2;i++){
          if(N%i==0)
           sum = sum + i;
        }

        if(sum>N)
          System.out.println("It is an abundant number");

        else 
          System.out.println("It is not an abundant number");  

        sc.close();     
  }
}