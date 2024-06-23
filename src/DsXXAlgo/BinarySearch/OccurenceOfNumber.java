package DsXXAlgo.BinarySearch;

public class OccurenceOfNumber {
    public static void main(String[] args) {
        int[] nums  = {0,1,2,3,4,4,4,5,6,7,8,9};
        System.out.println(search(nums,4));
    }
    public static int search(int[] nums,int target){
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                high = mid;
                low = mid;
                while ( (high<= nums.length-1 && nums[high] == target) || (low>= 0 && nums[low] == target)){
                    boolean moving = false;
                    if(high+1 <= nums.length-1 && nums[high+1] == target){
                        high=high+1;
                        moving = true;
                    }
                    if(low-1 >=0 && nums[low-1] == target){
                        low=low-1;
                        moving = true;
                    }
                    if(!moving){
                        break;
                    }
                }
                int ans = (high-low) + 1;
                return ans;
            }else if(target>nums[mid]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
