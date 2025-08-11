package DS_ALGO.Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class Union {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,11};
        int[] arr2 = {3,3,4,5,6,7,8};
        List<Integer> ans = new ArrayList<>();
        int i =0;
        int j=0;
        while (i< arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                if(ans.isEmpty()){
                    ans.add(arr1[i]);
                    i++;
                }else{
                    if(ans.get(ans.size()-1)!=arr1[i]){
                        ans.add(arr1[i]);
                        i++;
                    }else{
                        i++;
                    }
                }
            }
            else if(arr1[i]>arr2[j]){
                if(ans.isEmpty()){
                    ans.add(arr2[j]);
                    j++;
                }else{
                    if(ans.get(ans.size()-1)!=arr2[j]){
                        ans.add(arr2[j]);
                        j++;
                    }else{
                        j++;
                    }
                }
            }
           else if(arr1[i]==arr2[j]){
                if(ans.isEmpty()){
                    ans.add(arr1[i]);
                    i++;
                    j++;
                }else{
                    if(ans.get(ans.size()-1)!=arr1[i]){
                        ans.add(arr1[i]);
                        i++;
                        j++;
                    }else{
                        i++;
                        j++;
                    }
                }
            }
        }

        while(i<arr1.length){
            if(ans.isEmpty()){
                ans.add(arr1[i]);
                i++;
            }else{
                if(ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                    i++;
                }else{
                    i++;
                }
            }
        }

        while (j<arr2.length){
            if(ans.isEmpty()){
                ans.add(arr2[j]);
                j++;
            }else{
                if(ans.get(ans.size()-1)!=arr2[j]){
                    ans.add(arr2[j]);
                    j++;
                }else{
                    j++;
                }
            }
        }


        System.out.println(ans);
    }
}
