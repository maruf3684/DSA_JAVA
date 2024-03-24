package DsXXAlgo.Array.Mid;

public class MejorityEliments {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1   ,1,2,2};
        int count = 1;
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(count==0){
                ans = nums[i];
            }
            if(nums[i]==ans){
                count++;
            }else {
                count --;
            }
        }
        System.out.println(ans);
    }
}
