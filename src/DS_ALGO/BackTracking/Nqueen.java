package DS_ALGO.BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Nqueen {

    public static void main(String[] args) {
        var ans  = solveNQueens(4);
        System.out.println(ans);
    }


    public static List<List<String>> solveNQueens(int n){
        int[][] list = new int[n][n];
        List<List<List<String>>> ans = new ArrayList<>();
        List<List<String>> board = new ArrayList<>();
        List<List<String>> fin = new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                list[i][j]=0;
            }
        }

        for (int i = 0; i < n; i++) {
            List<String> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(".");
            }
            board.add(row);
        }

        solve(list,0,ans,board);

        for (List<List<String>> first  : ans) {
            List<String> t = new ArrayList<>();
            for (List<String> second : first) {
                t.add(getArr(second));
            }
            fin.add(t);
        }


        return fin;
    }


    public static void solve(int[][] list,int row,List<List<List<String>>> ans, List<List<String>> board ){
        if(row == list.length){
            ans.add(board);
            return;
        }

        for(int col=0; col<list.length; col++){
            if(isSafe(list,row,col)){
                list[row][col] = 1;
                board.get(row).set(col,"Q");
                List<List<String>> cp = board.stream()
                        .map(ArrayList::new)
                        .collect(Collectors.toCollection(ArrayList::new));
                solve(list,row+1,ans,cp);
                board.get(row).set(col,".");
                list[row][col] = 0;
            }
        }
        return;
    }

    public static boolean isSafe(int[][] list,int row,int column){
        //column check
        for(int j=0;j<list.length;j++){
            if(list[row][j] != 0){
                return false;
            }
        }

        //row check
        for(int i=0;i<list.length;i++){
            if(list[i][column] != 0){
                return false;
            }
        }

        //upperLeft
        int x = row;
        int y = column;
        while(x>=0 && y>=0){
            if(list[x][y] != 0){
                return false;
            }
            x=x-1;
            y=y-1;
        }

        //lowerLeft
        x = row;
        y = column;
        while(x<list.length && y>=0){
            if(list[x][y] != 0){
                return false;
            }
            x=x+1;
            y=y-1;
        }


        //upperRight
        x = row;
        y = column;
        while(x>=0 && y<list.length){
            if(list[x][y] != 0){
                return false;
            }
            x=x-1;
            y=y+1;
        }


        //lowerRight
        x = row;
        y = column;
        while(x<list.length && y<list.length){
            if(list[x][y] != 0){
                return false;
            }
            x=x+1;
            y=y+1;
        }


        return true;
    }

    public static String  getArr(List<String> list){
        StringBuilder sb = new StringBuilder();
        sb.append('"');
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
        }
        sb.append('"');
        return sb.toString();
    }
}