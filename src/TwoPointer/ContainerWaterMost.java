package TwoPointer;

public class ContainerWaterMost {
    public static void main(String[] args) {
        int[] height = {2,3,4,5,18,17,6};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height) {
       int ptr1 = 0;
       int ptr2 = height.length-1;
       int small = Math.min(height[ptr1] , height[ptr2]);
       int maxAns = small * (ptr2-ptr1);

       while (ptr2>ptr1){
           if(height[ptr1]>height[ptr2]){
               ptr2 --;
           }else {
               ptr1 ++;
           }
           small = Math.min(height[ptr1] , height[ptr2]);
           maxAns = Math.max(maxAns,small * (ptr2-ptr1));
       }
       return maxAns;
    }
}
