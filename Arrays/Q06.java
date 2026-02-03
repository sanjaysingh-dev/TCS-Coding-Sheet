// Problem Statement: Rearrange a given array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order

package Arrays;
import java.util.*;

public class Q06 {

    static int[] rearrange(int a[]){
        
        int N = a.length;
        int i = N/2;
        int j = N-1;

        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        return a;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0;i<N;i++)
             arr[i] =sc.nextInt();

       Arrays.sort(arr);
       rearrange(arr);

       System.out.println("Modified Arrays:");
       for(int i=0;i<N;i++)
         System.out.print(arr[i]+" ");

       sc.close();
    }   
}
