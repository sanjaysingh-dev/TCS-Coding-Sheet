// Problem Statement: Given an integer Print “YES” if it is a strong number else print “NO”.

package Numbers;
import java.util.*;

public class Q22{
  
  static int factorial(int A){

    int fact = 1;

     for(int i=1;i<=A;i++)
       fact=fact*i;

    return fact;   
  }
  
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int sum = 0;
      int original = N; 

      while(N>0){
        int digit = N%10;
        sum = sum+factorial(digit);
        N=N/10;
      }

      if(sum==original)
       System.out.println("YES");

      else 
       System.out.println("NO");

      sc.close();  
  }
}