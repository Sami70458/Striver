package Arrays.Medium;
import java.util.*;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,2,1,0,2,0,1,1,2,2,0};

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2){
                swap(arr,mid,high);
                high--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;
    }
}

/*

Time Complexity:

Best Case: O(n)

Average Case: O(n)

Worst Case: O(n)

Space Complexity:

Auxiliary Space: O(1) (in-place sorting, only uses a few pointers and temp variable)

*/

