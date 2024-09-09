package TwoPointer;

import java.util.Arrays;

public class TappingRain {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int leftmaxValue = Integer.MIN_VALUE;
        int[] rightMax = new int[height.length];
        int rightmaxValue = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            if (i==0){
                leftMax[i]=height[i];
                leftmaxValue = leftMax[i];
            }else {
                leftmaxValue = Math.max(height[i],leftmaxValue);
                leftMax[i] = leftmaxValue;
            }
        }

        for (int i = height.length-1; i >= 0; i--) {
            if (i==height.length-1){
                rightMax[i]=height[i];
                rightmaxValue = rightMax[i];
            }else {
                rightmaxValue = Math.max(height[i],rightmaxValue);
                rightMax[i] = rightmaxValue;
            }
        }

        int count =0;
        for (int i = 0; i < height.length; i++) {
            count = count + (Math.min(leftMax[i],rightMax[i]) - height[i]);
        }

        return count;
    }
}
