// Problem Statement: Given an integer num, repeatedly add all its digits until the result has only one digit, and return i .

package Numbers;
import java.util.*;

public class Q28{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while(N>=10){
            int sum =0; 

          while(N>0){
            int digit = N%10;
            sum = sum + digit;
            N=N/10;
          }

          N = sum;
        } 

        System.out.println(N);

        sc.close();     
  }
}
