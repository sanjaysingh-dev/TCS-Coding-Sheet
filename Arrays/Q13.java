// Problem Statement: Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific position.

package Arrays;
import java.util.*;

public class Q13 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int arr[] = new int[N];

      for(int i=0;i<N;i++)
       arr[i] = sc.nextInt();

       System.out.println("Enter a new element to be added in the beginning of the array:");
       int element1 = sc.nextInt();

       System.out.println("Enter a new element to be added at the end of the array:");
       int element2 = sc.nextInt();

       System.out.println("Enter a new element and the postition at which it needs to be added:");
       int element3 = sc.nextInt();
       int position = sc.nextInt();

       ArrayList<Integer> list = new ArrayList<>();
       for(int i=0;i<N;i++)
        list.add(arr[i]);

       list.add(0,element1);
       list.add(element2);
       list.add(position,element3);

       System.out.println("Updated Array:");
       System.out.println(list);

       sc.close();
  }
}