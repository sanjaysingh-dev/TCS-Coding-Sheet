// Problem Statement: Search an element in an array and return its position

package Arrays;
import java.util.*;

public class Q24{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int ar[] = {6,7,9,5,3,10};
      int N = ar.length;

      int B = sc.nextInt();

      for(int i=0;i<N;i++){
        if(ar[i]==B)
         System.out.println(i);
      }

      sc.close();
     }
}