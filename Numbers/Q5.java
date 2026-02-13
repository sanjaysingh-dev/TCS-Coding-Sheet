// Problem Statement:Given an integer N, return true it is an Armstrong number otherwise return false.

package Numbers;
import java.util.*;

public class Q5{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int original = N;
        int test = N;

        int sum=0;
        int K=0;

        while(N>0){
           K++;
           N=N/10;
        }

        while(test>0){
          int digit = test%10;
          sum+=(int)Math.pow(digit,K);
          test=test/10;
        }

        System.out.println(sum==original);

      sc.close();   
    }
}