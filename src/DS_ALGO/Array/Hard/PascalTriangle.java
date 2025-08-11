package DS_ALGO.Array.Hard;

//                  1
//               1      1
//            1      2      1
//         1      3       3      1
//      1      4      6      4      1
//   1      5     10     10     5       1

//Q1: row number and column number given, what is the element? like R=5,C=3 ans: element = 6
// so n=r=5-1 and r = 3-1 that means nCr= 4C2
//Formulla =  nCr = n!/r!*(n-r)!
//ex: 10c3 = 10*9*8/3*2*1  -> important to note/minimize formula

//Q2: print any nth row in pascel triangle? if n = 5 ans: 1,4,6,4,1
//Q#: print the entire triangle?

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        //System.out.println(Q1(10,3));
        //Q2(6);
        Q3(6);
    }

    public static int Q1(int R,int C){
        int res = 1;
        for (int i = 0; i < C; i++) {
            res=res*(R-i);
            res= res/(i+1);
        }
        return res;
    }

    public static List<Integer> Q2(int R){
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(ans);

        for (int i = 1; i < R; i++) { //2,3,4,5
            ans = ans*(R-i);
            ans=ans/i;
            list.add(ans);
        }
        System.out.println(list);
        return list;
    }

    public static void Q3(int R){
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <=R; i++) {
            list.add(Q2(i));
        }
        System.out.println(list);
    }
}

