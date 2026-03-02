// Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

package Arrays;
import java.util.*;

public class Q08{

  static void reverse(int ar[],int s, int e){

    while(s<e){
      int temp = ar[s];
      ar[s] = ar[e];
      ar[e] = temp;
      s++;
      e--;
    }

  }

  static void rightRotate(int A[], int K){
     int N = A.length;
     K = K%N;

     reverse(A,0,N-1);
     reverse(A,0,K-1);
     reverse(A,K,N-1);

     System.out.println("Array after right rotation by "+K+" elements:");
     for(int i=0;i<N;i++)
       System.out.print(A[i]+" ");
  }

  static void leftRotate(int A[], int K){
     
     int N = A.length;
     K = K%N;

     reverse(A,0,K-1);
     reverse(A,K,N-1);
     reverse(A,0,N-1);

     System.out.println("Array after left rotation by "+K+" elements:");
     for(int i=0;i<N;i++)
       System.out.print(A[i]+" ");
     

  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int arr[] = new int[N];

      for(int i=0;i<N;i++)
       arr[i] = sc.nextInt();

      int k = sc.nextInt();        
      
      leftRotate(arr.clone(),k);
      System.out.println();
      rightRotate(arr.clone(),k);

      sc.close();
  }
}