package DsXXAlgo.Array.Hard;

public class AllSubarray {
    public static void main(String[] args) {
        int[] nums = {1,-1,3,2,-2,-8,1,7,10,23};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                System.out.print(nums[j]);
            }
            System.out.println();
        }
    }
}
