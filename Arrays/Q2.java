// Problem Statement: Given an array, we have to find the largest element in the array.

import java.util.*;

public class Q2{

    static int MaxElement(int a[]){

        int N = a.length;
      if(N==0)
         return Integer.MIN_VALUE;

        int max = a[0];

      for(int i=0;i<N;i++){
        if(a[i]>max)
            max = a[i];
      }

      return max;
    }

     public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0;i<N;i++)
             arr[i] = sc.nextInt();

        int max = MaxElement(arr);

        if(max==Integer.MIN_VALUE)
            System.out.println(" Array is empty");
        else
        System.out.println("Largest Number in the array: "+max);
        
        sc.close();
     }
}