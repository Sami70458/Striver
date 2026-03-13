package Arrays.Medium;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int[] ans = new int[2];

        for(int i = 0; i<nums.length;i++){
            int diff= target - nums[i];

            if(map.containsKey(diff) && map.get(diff)!=i){
                ans[0] = map.get(diff);
                ans[1] =i;
            }
        }

        System.out.println(Arrays.toString(ans));
    }
}
