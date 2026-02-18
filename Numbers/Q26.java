// Problem Statement: Check if the number is a Harshad(or Niven) number or not.

package Numbers;
import java.util.*;

public class Q26{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;
        int original = N;

        while(N>0){
          int digit = N%10;
          sum = sum+digit;
          N=N/10;
        }

        if(original%sum==0)
           System.out.println("It is a harshad number");

        else 
          System.out.println("It is not a harshad number");

        sc.close();     
  }
}