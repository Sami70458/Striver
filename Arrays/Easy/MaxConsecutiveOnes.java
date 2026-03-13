package Arrays.Easy;

import java.util.*;


public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,0,0,0,1,1,1};

        int cnt = 0;
        int maxi = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]==1){
                cnt++;
            }else{
                cnt = 0;
            }

            maxi = Math.max(maxi,cnt);
        }

        System.out.println(maxi);
    }
}

/* 
Time Complexity:

Best Case: O(n)

Average Case: O(n)

Worst Case: O(n)

Space Complexity:

Auxiliary Space: O(1)
*/
