// Problem Statement: Find all the repeating elements present in an array.

package Arrays;
import java.util.*;

public class Q14 {

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

          if(count>1 && list.contains(arr[i])==false )
           list.add(arr[i]);
      }

      System.out.println(list);
      sc.close();
  }
}