package DsXXAlgo.Array.Random;

public class SetMatrixZero_14 {
    public static void main(String[] args) {
        int[][] spiralArray = {
                {1, 1, 1, 1},
                {1, 0, 0, 1},
                {1, 1, 0, 1},
                {1, 1, 0, 1}
        };
        int[] row = {0,0,0,0};
        int[] col = {0,0,0,0};
        System.out.println(java.util.Arrays.deepToString(spiralArray).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        System.out.println("\n");
        for (int i = 0; i < spiralArray.length; i++) {
            for (int j = 0; j < spiralArray[0].length; j++) {
                if(spiralArray[i][j]==0){
                    if(row[i] != 1){
                        row[i] = 1;
                    }
                    if( col[j] != 1){
                        col[j] = 1;
                    }

                }
            }
        }

        for (int i = 0; i < spiralArray.length; i++) {
            for (int j = 0; j < spiralArray[0].length; j++) {
                if( row[i] == 1 || col[j] == 1){
                    spiralArray[i][j]=0;
                }
            }
        }
        System.out.println(java.util.Arrays.deepToString(spiralArray).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }
}
