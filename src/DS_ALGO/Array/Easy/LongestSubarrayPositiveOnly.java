package DS_ALGO.Array.Easy;

public class LongestSubarrayPositiveOnly {
    public static void main(String[] args) {
        int[] arr = {3,1,1,2,1  ,2,1,1,4};
        int givenSum = 5;
        //brut(arr,givenSum);
        best(arr,givenSum);
    }

    public static void brut(int[] arr,int givenSum){
        int sum = 0;
        int count = 0;
        int mainCount=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = sum +arr[j];
                count = count + 1;
                if(sum == givenSum){
                    if (mainCount<count){
                        mainCount = count;
                    }
                } else if (sum>givenSum) {
                    sum = 0;
                    count = 0;
                    break;
                }

            }
        }

        System.out.println(mainCount);
    }

    public static void best(int[] arr,int givenSum){
        int left = 0;
        int right = 0;
        int sum =0;
        int distance;
        int maxdis=0;
        String ans ="not found ";

        while (right<arr.length){
            sum=sum+arr[right];

            if(sum==givenSum){
                distance=right-left;
                if(maxdis<=distance){
                    maxdis=distance;
//                    ans = STR."left = \{left}, right = \{right}";
                }
                right++;
            }else if(sum<givenSum){
                right++;
            } else {
                while (sum>givenSum && left<=right){
                    sum=sum-arr[left];
                    left++;
                }
                right++;
            }
        }

        System.out.println(ans);
    }
}
