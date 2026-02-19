// Problem Statement: Given the radius of the circle, calculate the area of the circle. .

package Numbers;
import java.util.*;

public class Q34{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();

        double area = 3.142 *(R*R);
        
        System.out.println(Math.round(area*100)/100.0);

        sc.close();     
  }
}
