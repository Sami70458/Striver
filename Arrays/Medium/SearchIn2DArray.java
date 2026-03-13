package Arrays.Medium;
import java.util.*;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        int target = 0;

        boolean ans=false;

        int n = matrix.length;
        int m = matrix[0].length;

        int low = 0, high = n*m-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            int row = mid/m;
            int col = mid%m;

            if(matrix[row][col]==target){
                ans = true;
                break;
            }else if(matrix[row][col]<target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        System.out.println(ans);
        
    }
}


/*

Time Complexity:

Best Case: O(1) (if the target is found at the first check)

Average Case: O(log(n × m))

Worst Case: O(log(n × m))

(n = number of rows, m = number of columns)

Space Complexity:

Auxiliary Space: O(1)

*/
