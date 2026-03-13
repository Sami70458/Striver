package Arrays.Easy;

import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {2,0,9,8,0,1,2,4,0,0,5};

        int pos = 0;

        for(int i = 0; i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
                pos++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
