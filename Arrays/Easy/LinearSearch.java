package Arrays.Easy;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,0,1};

        int target = 5;

        int ans=0;

        for(int i = 0; i<arr.length;i++){
            if(arr[i]==target){
                ans = i;
            }
        }

        System.out.println(ans);
    }
}
