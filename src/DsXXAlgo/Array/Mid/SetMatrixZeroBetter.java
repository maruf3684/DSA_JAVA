package DsXXAlgo.Array.Mid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeroBetter {
    public static void main(String[] args) {
        int[][] matrix ={
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        System.out.println(Arrays.deepToString(matrix));
        traversal(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void traversal(int[][] matrix){
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0){
                   row[i]=1;
                   col[j]=1;
                }
            }
        }

//        System.out.println(Arrays.toString(row));
//        System.out.println(Arrays.toString(col));

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
