// Problem Statement: Given two numbers. Find the greatest of two numbers.
 
package Numbers;
import java.util.*;

public class Q12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A =sc.nextInt();
        int B = sc.nextInt();

        if(A>B)
          System.out.println(A+" is greater");

        else 
          System.out.println(B+" is greater");

       sc.close(); 
    }
}
