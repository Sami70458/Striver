package Arrays.Easy;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,3,5,5,};

        //int k = removeDup(nums);

        int ki = removeDupTwoPointer(nums);

        System.out.println(ki);

        for(int i = 0; i<ki ;i++){
            System.out.print(nums[i]+" ");
        }


    }

    public static int removeDup(int[] arr){
        HashSet<Integer> seen = new HashSet<>();

        int index = 0;

        for(int num : arr){
            if(!seen.contains(num)){
                seen.add(num);

                arr[index] = num;

                index++;
            }
        }

        return index;
    }

    public static int removeDupTwoPointer(int[] arr){
        int i = 0;

        for(int j = 1; j<arr.length; j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        return i+1;
    }
}
