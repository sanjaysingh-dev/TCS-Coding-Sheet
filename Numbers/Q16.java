// Problem Statement: Given a number N, print the smallest and largest digits present in the number.

package Numbers;
import java.util.*;

public class Q16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int max = 0;
        int min = 9;

        while(N>0){
            int digit = N%10;
           
            if(digit>max)
                 max = digit;

            if(digit<min)
                min = digit;

            N=N/10;
        }

        System.out.println("Largest digit: "+max);
        System.out.println("Smallest digit: "+min);

        sc.close();
    }    
}
