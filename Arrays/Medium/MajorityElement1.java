package Arrays.Medium;
import java.util.*;

public class MajorityElement1 {
    public static void main(String[] args) {

         int[] nums = {2, 1, 1,1,1,1,1, 2, 2};

         int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i = 0; i < n; i++){
              if(map.get(nums[i]) > n/2){
                    System.out.println(nums[i]);
                    break;
                }
        }
      


    }
}


/*
Time Complexity:

Best Case: O(n)

Average Case: O(n)

Worst Case: O(n)

Space Complexity:

Auxiliary Space: O(n) (for the HashMap)
*/

