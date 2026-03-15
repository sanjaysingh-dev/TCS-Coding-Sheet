// Problem Statement: Given a string, write a program to remove all the whitespaces from the string.

package Strings;
import java.util.*;

public class Q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<S.length()-1;i++){
            if(S.charAt(i)!=' ')
                 sb.append(S.charAt(i));
        }

        System.out.println(sb.toString());
        sc.close();
    } 
    
}
