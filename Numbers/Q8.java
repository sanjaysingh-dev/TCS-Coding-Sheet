// Problem Statement: Given a number n check whether it's positive or negative.

package Numbers;
import java.util.*;

public class Q8{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);

        int N =sc.nextInt();

        if(N>0)
            System.out.println("Positive");

        else 
            System.out.println("Negative");

       sc.close(); 
  }
}
