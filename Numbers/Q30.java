// Problem Statement: Find permutations in which n people can occupy r seats in a classroom.

package Numbers;
import java.util.*;

public class Q30{

  static int fact(int A){
     int fact = 1;

     for(int i=1;i<=A;i++)
      fact = fact*i;

      return fact;
  }

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int r = sc.nextInt();
        
        int ans = fact(N)/fact(N-r) ;

        System.out.println(ans);

        sc.close();     
  }
}
