// Problem Statement: Given numerator and denominator of two fractional numbers, return the sum of two fractional numbers.

package Numbers;
import java.util.*;

public class Q31{

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int D1 = sc.nextInt();
        int N2 = sc.nextInt();
        int D2 = sc.nextInt();

        int numerator = (N1*D2)+(N2*D1);
        int denominator = (D1*D2);
        
        
        System.out.println("Numerator="+numerator+" "+"Denominator="+denominator);

        sc.close();     
  }
}