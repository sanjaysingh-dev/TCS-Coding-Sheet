// Problem Statement: Given an unsorted array, remove duplicates from the array.

package Arrays;
import java.util.*;

public class Q12{

static int[] removeDuplicate(int a[]){

  int N = a.length;
  ArrayList<Integer> result = new ArrayList<>();

  for(int i=0;i<N;i++){
      int count = 0;

     for(int j=0;j<i;j++){
       if(a[i]==a[j])
          count++;
     }

      if(count==0)
       result.add(a[i]);
  }

  int r[] = new int[result.size()];
  
  for(int i=0;i<result.size();i++)
    r[i] = result.get(i);  
  
 return r; 
  }

public static void main(String args[]){

  Scanner sc = new Scanner(System.in);

  int N = sc.nextInt();
  int arr[] = new int[N];

  for(int i=0;i<N;i++)
   arr[i] = sc.nextInt();
   
   int result[] = removeDuplicate(arr);
   
   for(int i=0;i<result.length;i++)
    System.out.print(result[i]+" ");

   sc.close(); 
  }
}


