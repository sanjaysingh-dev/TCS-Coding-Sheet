// Problem Statement: Find the LCM of two numbers.

package Numbers;
import java.util.*;

public class Q25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        int max = Math.max(N1,N2);
        int lcm = 0;

        for(int i=0;i<=N1*N2;i+=max){
            if(i%N1==0 && i%N2==0){
                lcm = i ;
                break;
            }
        }

        System.out.println("LCM: "+lcm);
        sc.close();
    }    
}
