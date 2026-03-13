package Arrays.Easy;

import java.util.*;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};

        int n = arr.length;

        int sum = ((n+1) * (n+2)) / 2;

        int total = 0;

        for(int i = 0; i<n; i++){
            total += arr[i];
        }

        System.out.println(sum-total);
    }
}
