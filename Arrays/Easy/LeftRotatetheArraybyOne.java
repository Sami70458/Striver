package Arrays.Easy;

import java.util.*;

public class LeftRotatetheArraybyOne {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,6};

        leftRotate(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void leftRotate(int[] arr){
        int temp = arr[0];

        for(int i = 1; i<arr.length;i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = temp;
    }
}
