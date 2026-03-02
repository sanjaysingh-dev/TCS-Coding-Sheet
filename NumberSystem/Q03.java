// Problem Statement: Convert decimal to binary number.


package NumberSystem;
import java.util.*;

public class Q03 {
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    StringBuilder sb = new StringBuilder();

    while(N>0){
       int rem  = N%2;
       sb.append(rem);
       N=N/2;
    }

    sb.reverse();

    System.out.println(sb.toString());
    sc.close();
  }
}