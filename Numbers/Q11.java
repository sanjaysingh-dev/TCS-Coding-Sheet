/* Problem Statement: Given a geometric Progression (G.P) sequence with some inputs as
1. a, first term
2. r, common ratio
3. n, number of terms
Write a program to find the sum of the Geometric Progression Series. */

package Numbers;
import java.util.*;

public class Q11{
  public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    double R = sc.nextDouble();
    int N = sc.nextInt(); 
 
    
    double sum = 0;
    double term = A;

    for(int i=0;i<N;i++){
      sum+= term;
      term*= R;
    }
    

    System.out.println(sum);
    sc.close();  

  }
}