// Problem Statement: Given an array of n integers, sort the array using the Quicksort method.

package Sorting;
import java.util.*;

public class Q4 {

    public void quickSort(int A[], int l, int r){

        if(l>=r)
          return;

        int p = parition(A,l,r);

        quickSort(A,l,p-1);
        quickSort(A,p+1,r);
    }

    public int parition(int A[], int i, int j){

        int p = A[i];
        int l = i+1;
        int r = j;

        while(l<=r){

            if(A[l]<=p)
                 l++;

            else{
                int temp = A[l];
                A[l] = A[r];
                A[r] = temp;

                r--;
            }
        }  

            int temp = A[i];
            A[i] = A[r];
            A[r] = temp; 

            return r;

        }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for(int i=0;i<N;i++)
            A[i] = sc.nextInt();

        quickSort(A,0,N-1);

        for(int i=0;i<N;i++)
          System.out.print(A[i]+" ");
   
        sc.close();
    }
}
