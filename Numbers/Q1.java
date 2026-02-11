// Problem Statement: Given an integer N, return true if it is a palindrome else return false.

package Numbers;
import java.util.*;

public class Q1{

  static boolean palindrome(int A){

      int original = A; 
      int reverse = 0;

      if(A<0)
        return false; 

      while(A>0){
        int digit = A%10;
        reverse = reverse*10+digit;
        A=A/10;
      }

      return reverse==original;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      
      if(palindrome(N))
       System.out.println("It is a palindrome number");

      else 
       System.out.println("It is not a palindrome number");

     sc.close();         
      }
}