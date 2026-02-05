// Problem Statement: Find all the non-repeating elements for a given array. Outputs can be in any order.

package Arrays;
import java.util.*;

public class Q15{

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int arr[] = new int[N];

      for(int i=0;i<N;i++)
       arr[i] = sc.nextInt();

       ArrayList<Integer> list = new ArrayList<>();

      for(int i=0;i<N;i++){
         int count = 0;

           for(int j=0;j<N;j++){
            if(arr[i]==arr[j])
             count++;
           }

          if(count==1)
           list.add(arr[i]);
      }

      System.out.println(list);
      sc.close();
  }
}