// Problem Statement: Given a number, check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

package Numbers;
import java.util.*;

public class Q23 {

 static boolean automorphic(int N){

      int sq = N*N;      
      
      while(N>0){
        if(N%10 != sq%10)
          return false;

         N = N/10;
         sq = sq/10;  
      }
 
    return true;
}


  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

     int N = sc.nextInt();
      
     if(automorphic(N))
      System.out.println("It is a Automorphic Number");

     else 
      System.out.println("It is not a Automorphic Number");

      sc.close();
 }
}