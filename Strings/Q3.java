// Problem Statement: Given a character, Find the ASCII value of the character.

package Strings;
import java.util.*;

public class Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        int c = ch;

        System.out.println(c);
        sc.close();
    }
}
