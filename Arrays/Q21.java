// Problem Statement: Given a 0-indexed integer array nums, find the leftmost equilibrium Index.

package Arrays;
import java.util.*;

public class Q21{

 static int equilibrium(int A[]){

    int N = A.length;

    for(int i=0;i<N;i++){

      int lsum=0;
      int rsum=0;

      for(int j=0;j<i;j++)
        lsum+=A[j];

      for(int k=i+1;k<N;k++)
        rsum+=A[k];

       if(lsum==rsum)
        return i;
    }
   return -1;
 } 

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int arr[] = new int[N];

    for(int i=0;i<N;i++)
      arr[i] = sc.nextInt();

    System.out.println(equilibrium(arr));
    sc.close();
       
 }
 }     
  
