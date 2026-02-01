// Problem Statement: Given an array, we have to find the smallest element in the array.

package Arrays;
import java.util.*;

public class Q1 {

 public static int MinElement(int a[]){
    int N = a.length;
    if(N==0)
        return Integer.MIN_VALUE;

    int min = a[0];

    for(int i=0;i<N;i++){
      if(a[i]<min)
         min = a[i];
      }    
  return min;
 }   

 public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int arr[] = new int[N];

    for(int i=0;i<N;i++)
        arr[i] = sc.nextInt();

   int min = MinElement(arr);

  if(min==Integer.MIN_VALUE)
    System.out.println(" Array is empty"); 
  else 
  System.out.println(" Smallest Number in the array: "+min);
  
  sc.close();
}
}

