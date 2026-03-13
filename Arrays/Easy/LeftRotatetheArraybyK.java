package Arrays.Easy;

import java.util.*;

public class LeftRotatetheArraybyK {
    public static void main(String[] args) {
        int[] arr = {2 , 4,1,5,6,9};

        int k = 2;

        k = k%arr.length;
        //leftRotate(arr,k);

        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

        reverse(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    static void leftRotate(int[] arr,int k){

        int N = arr.length;

        k = k%N;

        int[] temp = new int[k];

        for(int i = 0; i<k;i++){
            temp[i] = arr[i];
        }

        for(int i = k; i<N ; i++){
            arr[i-k] = arr[i];
        }

        for(int i = N-k; i<N; i++){
            arr[i] = temp[i-(N-k)];
        }
    }

    static void reverse(int[] arr,int start, int end){
        
        
        
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
