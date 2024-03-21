package DsXXAlgo.Array;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int max_con=0;
        int curr_con = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                curr_con = curr_con+1;
                if (max_con<curr_con){
                    max_con = curr_con;
                }
            }else {
                curr_con=0;
            }
        }
        System.out.println(max_con);
    }
}
