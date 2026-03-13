package Arrays.Medium;
import java.util.*;

public class LargestSubArrayWithSumK {
    public static void main(String[] args) {
          int arr[] = {4, 1, 1, 1, 2, 3, 5};
        int k = 5;

        int result = largestSubarray(arr, k);

        System.out.println("Largest Subarray Length = " + result);
    }

    static int largestSubarray(int[] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0, maxLen = 0;

        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];

            if(sum==k){
                maxLen = i +  1;
            }

            if(map.containsKey(sum-k)){
                int len = i - map.get(sum-k);
                maxLen = Math.max(len,maxLen);
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }

        return maxLen;
    }
}
