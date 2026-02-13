// Problem Statement: Given an A.P. Series, we need to find the sum of the Series.

package Numbers;
import java.util.*;

public class Q10{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int D = sc.nextInt();
       
        int sum=0;
        int current=A;

        for(int i=1;i<=N;i++){ 
           sum+=current;
           current+=D;
        }

        System.out.println(sum);

      sc.close();   
    }
}