package DsXXAlgo.Array.Mid;

import java.util.*;


public class SetMatrixZero {
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0){
                    rowMaker(matrix,i);
                    colMaker(matrix,j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0 || matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }

    public static void rowMaker(int[][] matrix,int row){
        for (int j = 0; j < matrix[0].length; j++) {
            if(matrix[row][j]!=0){
                matrix[row][j]=-1;
            }
        }
    }
    public static void colMaker(int[][] matrix,int column){
        for (int i = 0; i < matrix.length; i++) {
            if(matrix[i][column]!=0){
                matrix[i][column]=-1;
            }
        }
    }

}
