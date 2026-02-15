// Problem Statement: Given three numbers. Find the greatest of three numbers.

package Numbers;
import java.util.*;

public class Q13 {
    public static void main(String[] main){
            Scanner sc = new Scanner(System.in);

            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

         if(A>B && A>C)
            System.out.println(A+" is the greatest");
        
         else if(B>C)
            System.out.println(B+" is the greatest");

         else 
            System.out.println(C+" is the greatest");

       sc.close();  
    }
}
