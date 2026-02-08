// Problem Statement: Given an array of N integers, the task is to replace each element of the array by its rank in the array.

package Arrays;
import java.util.*;

public class Q18{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int arr[] = new int[N];

    for(int i=0;i<N;i++)
     arr[i] = sc.nextInt();

     int ans[] = arr.clone();

     Arrays.sort(arr);

    for(int i=0;i<N;i++){
      for(int j=0;j<N;j++){
        if(ans[i]==arr[j]){
         System.out.print(j+1+" ");
         break;
        }
      }
    }

    sc.close();
  }
}