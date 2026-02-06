// Given an array of pairs, find all the symmetric pairs in the array

package Arrays;

public class Q16 {
    public static void main(String args[]) {

        int A[][] = {
            {1, 2},
            {3, 4},
            {2, 1},
            {5, 6},
            {4, 3}
        };

        int N = A.length;

        for (int i=0;i<N;i++) {
            for (int j=i+1;j<N;j++) {
            if (A[i][0] == A[j][1] && A[i][1] == A[j][0]) {
            System.out.print("("+ A[i][0]+", "+A[i][1]+")");
                }
            }
        }
    }
}

