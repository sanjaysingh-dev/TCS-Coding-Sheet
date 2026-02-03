// Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

package Arrays;
import java.util.*;

public class Q03{

  static void MinMax(int a[]){

   int N = a.length;

    if(N<2){
     System.out.println(-1);
      return; 
    }

    Arrays.sort(a);

    int smallest = a[1];
    int largest = a[N-2];

    System.out.println("Second largest elemnt in the array: "+largest);
    System.out.println("Second smallest elemnt in the array: "+smallest);
  }

  public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);

     int N = sc.nextInt();
     int arr[] = new int[N];

     for(int i=0;i<N;i++)
      arr[i] = sc.nextInt();
    
    MinMax(arr);
    sc.close();
  }
}