// Problem Statement: Write a program to remove all characters from a string except alphabets in a given string.

package Strings;
import java.util.*;

public class Q6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i =0;i<S.length();i++){
            if(S.charAt(i)>='A' && S.charAt(i)<='Z' || 
               S.charAt(i)>='a' && S.charAt(i)<='z')
                sb.append(S.charAt(i)); 
        }

        System.out.println(sb.toString());
        sc.close();
        }    
}
