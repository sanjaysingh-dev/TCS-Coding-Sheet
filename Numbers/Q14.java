// Problem Statement: Check if the given year is a leap year or not.

package Numbers;
import java.util.*;

public class Q14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if((N%4==0 && N%100!=0) ||  N%400==0 )
            System.out.println("It is a leap year");

        else 
            System.out.println("It is not a leap year");

      sc.close();  
    }
}
