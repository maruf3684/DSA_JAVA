package DsXXAlgo.Array.Hard;

//Given an integer array nums, return all the triplets [nums[i], nums[j],
// nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.
//Example 1:
//Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]


import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        //int[] nums ={-1,0,1,2,-1,4};
        int[] nums ={-1,0,1,2,-1,-4};

        //brut(nums);
        //print(nums);
        //better(nums);
        optimal(nums);
    }

    public static void print(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-2; i++) {
            System.out.println("i running");
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    System.
                            out.
                            print(STR."[\{nums[i]} \{nums[j]}\{nums[k]}]\n");
                }
                System.out.println();
            }
        }
    }

    public static List<List<Integer>> brut(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp = new ArrayList<>();
                        Collections.addAll(temp,nums[i],nums[j],nums[k]);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                }
            }
        }
        System.out.println(ans);
        return new ArrayList<>(ans);
    }

    public static List<List<Integer>> better(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                int neededElement = -(nums[i] + nums[j]);
                if(map.containsKey(neededElement)
                        && map.get(neededElement)!=i
                        && map.get(neededElement)!=j){
                    List<Integer> temp = new ArrayList<>();
                    Collections.addAll(temp,nums[i],nums[j],neededElement);
                    Collections.sort(temp);
                    ans.add(temp);
                }
            }
        }
        System.out.println(ans);
        return new ArrayList<>(ans);
    }

    public static List<List<Integer>> optimal(int[] nums) {
        //arr=[-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2]
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n-1 ; i++) {
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;
            while (j<k){
                int man = nums[i] + nums[j] + nums[k];
                if (man>0){
                    k--;
                } else if (man<0) {
                    j++;
                }else {
                    List<Integer> temp = new ArrayList<>();
                    Collections.addAll(temp,nums[i],nums[j],nums[k]);
                    list.add(temp);
                    j++;
                    k--;
                    while (j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                    while (j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        System.out.println(list);
        return list;
    }
}
