// Problem Statement: Given a String, write a program to remove vowels from the String.

package Strings;
import java.util.*;


public class Q4 {

    static boolean checkVowel(char ch){

    return ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' ||
           ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' ||
           ch == 'O' || ch == 'U';

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(!checkVowel(s.charAt(i)))
              sb.append(s.charAt(i));
        }

        System.out.println(sb.toString());
        sc.close();

    }
}
