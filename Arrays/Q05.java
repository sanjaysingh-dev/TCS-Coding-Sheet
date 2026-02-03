// Problem Statement: Given an array, we have found the number of occurrences of each element in the array.

package Arrays;
import java.util.Scanner;

public class Q05 {

    static void freqOfEach(int a[]){
        int N = a.length;

        for(int i=0;i<N;i++){

            boolean isFirstOccurrence = true;
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    isFirstOccurrence = false;
                    break;
                }
            }

            if (isFirstOccurrence==false)
                continue;
            
            
            int count=0;

            for(int j=0;j<N;j++){
              if(a[j]==a[i])
                count++;
           }

         System.out.println(a[i]+" "+count);  
     }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();

        freqOfEach(arr);
        sc.close();
    } 
}
