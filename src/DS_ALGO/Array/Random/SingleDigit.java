package DS_ALGO.Array.Random;

public class SingleDigit {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10};
        System.out.println(canAliceWin(arr));
    }

    public static boolean canAliceWin(int[] nums) {
        int single = 0;
        int doublex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>9){
                doublex = doublex + nums[i];
            }else {
                single = single + nums[i];
            }
        }

        if(single==doublex){
            return  false;
        }
        else {
            return  true;
        }
    }
}
