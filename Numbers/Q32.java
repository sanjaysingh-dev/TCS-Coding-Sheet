// Problem Statement: You are given an integer. Your task is to replace all the zeros in the integer with ones.

package Numbers;
import java.util.*;

public class Q32{

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String S = Integer.toString(N);
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<S.length();i++){
          if(S.charAt(i)=='0')
             sb.append('1');
          else 
             sb.append(S.charAt(i));
        }
        
        System.out.println(sb.toString());

        sc.close();     
  }
}
