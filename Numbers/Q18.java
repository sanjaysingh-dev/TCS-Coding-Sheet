// Problem Statement: Given a number X,  print its factorial.

package Numbers;
import java.util.*;

public class Q18 {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int fact = 1;

        for(int i=1;i<=N;i++)
            fact*=i;

       System.out.println("Factorial: "+fact);
       
       sc.close();
    }    
}
