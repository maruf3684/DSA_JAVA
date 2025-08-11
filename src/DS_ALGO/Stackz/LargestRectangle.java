package DS_ALGO.Stackz;

import java.util.Stack;

public class LargestRectangle {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] heights) {
        if(heights.length==1){
            return heights[0];
        }
        int maxi = 0;
        int[] prevSm = prevSm(heights);
        int[] nextSm = nextSm(heights);

        for (int i = 0; i < heights.length; i++) {
            int width = nextSm[i] - prevSm[i] -1;
            int area = width * heights[i];
            maxi = Math.max(maxi,area);
        }
        return maxi;
    }

    public static int[] prevSm(int[] heights) {
        int[] prevSm = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                prevSm[i] = stack.peek();
            } else {
                prevSm[i] = -1;
            }
            stack.push(i);
        }
        return prevSm;
    }

    public static int[] nextSm(int[] heights) {
        int[] nextSm = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = heights.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nextSm[i] =stack.peek();
            } else {
                nextSm[i] = heights.length;
            }
            stack.push(i);
        }
        return nextSm;
    }
}
