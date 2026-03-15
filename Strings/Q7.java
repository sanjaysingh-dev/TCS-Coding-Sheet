// Problem Statement: Write a program that reverses a given string (in-place).

package Strings;
import java.util.*;

public class Q7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int N = S.length();

        for(int i=0;i<N;i++)
            sb.append(S.charAt(i));

        int i = 0;
        int j = N-1;

        while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
