// Problem Statement: Given an unsorted array, find the median of the given array.

package Arrays;
import java.util.*;

public class Q10 {

    static int median(int a[]){

        int N = a.length;
        Arrays.sort(a);

        int m = a[N/2];

        return m;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();

        int ans = median(arr);

        System.out.println("Median: "+ans);
        sc.close();
    }
}
