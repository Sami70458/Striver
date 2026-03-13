package Arrays.Easy;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(secondLargest(arr));

    }

    public static int secondLargest(int[] arr){
        int n = arr.length;
        if(n<2) return -1;

        int max = arr[0];
        int second = Integer.MIN_VALUE;

        for(int i = 0; i<n ;i++){
            if(arr[i]>max){
            second = max;
            max = arr[i];
        }else if(arr[i]>second && arr[i]!=max){
            second = arr[i];
        }

        
       }

       return second;
    }
}
