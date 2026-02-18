// Problem Statement: Find the sum of numbers in the given range.

package Numbers;
import java.util.*;

public class Q29{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int r = sc.nextInt();
        int sum = 0 ;

        for(int i=l;i<=r;i++)
         sum = sum+i;

        System.out.println(sum);

        sc.close();     
  }
}