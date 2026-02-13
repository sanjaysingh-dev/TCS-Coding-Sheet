// Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers .

package Numbers;
import java.util.*;

public class Q9{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
       
        int sum=0;

        for(int i=0;i<=N;i++)
         sum+=i;

       System.out.println(sum);  

      sc.close();   
    }
}