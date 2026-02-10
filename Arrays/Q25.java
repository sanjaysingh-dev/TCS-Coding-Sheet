// Problem Statement: Given arr1[] and arr2[], we need to find whether arr1[] is a subset of arr2[]. An array is called a subset of another if all of its elements are present in the other array..

package Arrays;

public class Q25{
  public static void main(String[] args) {

      int ar1[] = {2, 4, 6};
      int ar2[] = {1, 2, 3, 4, 5, 6};

      boolean found = true; 

      for (int i = 0; i < ar1.length; i++) {
          int j;

          for (j = 0; j < ar2.length; j++) {
              if (ar1[i] == ar2[j]) {
                  break;
              }
          }

          if (j == ar2.length) {
              found = false;
              break;
          }
      }

      if (found)
          System.out.println("arr1[] is a subset of arr2[]");
      else
          System.out.println("arr1[] is not a subset of arr2[]");
  }
}