// Problem Statement: Given a number n, check whether a given number is even or odd.

package Numbers;
import java.util.*;

public class Q7{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
       
        if(N%2==0)
        System.out.println("Even");

        else
        System.out.println("Odd");  

      sc.close();   
    }
}