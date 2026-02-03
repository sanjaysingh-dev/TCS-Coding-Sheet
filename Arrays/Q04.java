// Problem Statement: You are given an array. The task is to reverse the array and print it.

package Arrays;
import java.util.*;

public class Q04{
   
   static int[] Reverse(int a[]){

    int N = a.length;

    int i=0;
    int j=N-1;

        while(i<j){
          int temp = a[i];
          a[i] = a[j];
          a[j] = temp;
          i++;
          j--;
         } 

      return a;
   }
     
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    if (N<=1) {
            System.out.print(-1);
            return;
        }

    int arr[] = new int[N];

    for(int i=0;i<N;i++)
     arr[i]=sc.nextInt();
     
    sc.close();
    Reverse(arr);
     
    for(int i=0;i<N;i++)
     System.out.print(arr[i]+" ");
     }
}  
