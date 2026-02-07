// Problem Statement: Given an array that contains both negative and positive integers, find the maximum product subarray.

package Arrays;
import java.util.*;

public class Q17{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int arr[] = new int[N];

      for(int i=0;i<N;i++)
       arr[i]=sc.nextInt();

       int max = Integer.MIN_VALUE;

       for(int i=0;i<N;i++){
        int product = 1;
         for(int j=i;j<N;j++){
              product*= arr[j];
              if(product>max)
                max = product;
         }
       }

      System.out.println("Max product subarray: "+max);
      sc.close(); 
  }
}