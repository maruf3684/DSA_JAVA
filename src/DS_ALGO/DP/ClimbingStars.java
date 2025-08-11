package DS_ALGO.DP;

public class ClimbingStars {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(dp(n));
        System.out.println(dp2(n));
    }

    public static int dp(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int option1 = dp(n-1);
        int option2 = dp(n-2);
        return option1+option2;
    }

    public static int dp2(int n){
        int onelaf = 0;
        int tholaf = 0;
        int way = 0;

        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }

        for (int i = 0; i <= n; i++) {
            if(i==1){
                onelaf = 1;
            }else if(i==2){
                tholaf = 2;
            }else {
                way = onelaf+tholaf;
                onelaf = tholaf;
                tholaf = way;
            }
        }

        return way;
    }
}
