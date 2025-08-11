package DS_ALGO.Patern;

public class Wpatern {
    public static void main(String[] args) {
        String st = "ABCDEFGHIJKLMNOPQ";
        int frequency = 5;

        //solution
        int m = frequency;
        int n = st.length();
        char[][] arr = new char[m][n];

        int printer = 0;
        boolean reverse = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(j == printer){
                    arr[j][i] = st.charAt(i);
                    if(reverse == false){
                        printer = printer+1;
                    }else {
                        printer = printer-1;
                    }

                    if(printer == frequency-1){
                        reverse = true;
                    } else if (printer==0) {
                        reverse = false;
                    }

                    break;
                }
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == '\u0000' ){
                    System.out.print(" ");
                }else {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.print("\n");
        }
    }
}
