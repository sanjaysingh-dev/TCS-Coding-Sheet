// Problem Statement: Given a string, check if the string is palindrome or not. A string is said to be palindrome if the reverse of the string is the same as the string.

package Strings;
import java.util.*;

public class Q1 {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            String S = sc.nextLine();
            int N = S.length();

            for(int i=0;i<N/2;i++){
                if(S.charAt(i)!=S.charAt(N-i)){
                    System.out.println("Not Palindrome");
                    return;
                }
            }

         System.out.println("Palindrome");
         sc.close();   
    }

    
}
