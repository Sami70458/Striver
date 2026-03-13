package Arrays.Medium;
import java.util.*;


public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, -4};

        int sum = 0, maxi = Integer.MIN_VALUE;
        int ansStart = -1, ansEnd = -1,start = -1;

        for(int i = 0; i<arr.length; i++){

            if(sum == 0){
               start = i;
            }
            sum += arr[i];

            if(sum>maxi){
                maxi = sum;
                ansStart=start;
                ansEnd = i;
            }

            if(sum<0){
                sum = 0;
            }
        }

        System.out.println(maxi);
        for(int i = ansStart; i <= ansEnd; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
