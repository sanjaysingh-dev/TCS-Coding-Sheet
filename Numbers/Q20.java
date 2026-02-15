// Problem Statement: Find all factors of a number or find all distinct divisors of a natural number.

package Numbers;
import java.util.*;

public class Q20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=1;i<=N;i++){
            if(N%i==0)
                System.out.print(i+" ");
        }
    sc.close();
    }
}
