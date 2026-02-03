// Problem Statement: Given an array arr of size n, the task is to find the sum of all the elements in the array .

package Arrays;
import java.util.*;

public class Q07 {

    static int sum(int a[]){

        int N = a.length;
        int sum = 0;

        for(int i=0;i<N;i++)
            sum+=a[i];

       return sum; 
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int ans = sum(arr);

        System.out.println("Sum of the elements: "+ans);
        sc.close();
    }
}
