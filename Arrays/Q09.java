// Problem Statement: Find the average of all the elements in the array.

package Arrays;
import java.util.*;

public class Q09 {
 
    static double average(int a[]){
         
         int N = a.length;
         double sum = 0;

         for(int i=0;i<N;i++)
            sum+=a[i];

         double avg = sum/N;
         return avg;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0;i<N;i++)
          arr[i] = sc.nextInt();

        double ans = average(arr);

       System.out.println("Average: "+ans);
       sc.close();
    }
}

  
