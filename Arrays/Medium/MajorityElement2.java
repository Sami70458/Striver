package Arrays.Medium;

import java.util.*;

public class MajorityElement2 {
    public static void main(String[] args) {
         int[] nums = {2, 1, 1,1,1,1,1, 2, 2,2};

         int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        ArrayList<Integer> ans = new ArrayList<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i = 0; i < n; i++){
              if(map.get(nums[i]) > n/3 && !ans.contains(nums[i])){
                    ans.add(nums[i]);
                }
        }

        
        for(int i = 0; i < ans.size(); i++){
              System.out.print(ans.get(i) + " ");
        }
    }
}
