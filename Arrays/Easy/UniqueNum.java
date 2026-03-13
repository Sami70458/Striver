package Arrays.Easy;
import java.util.*;

public class UniqueNum {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,4,4,5,6,6};
        int ans = 0;

        for(int i = 0; i<arr.length;i++){
            ans = ans ^ arr[i];
        }

        System.out.println(ans);
    }
}
