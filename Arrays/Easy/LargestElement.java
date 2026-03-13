/*

Largest Element

Given an array of integers nums, return the value of the largest element in the array


Example 1

Input: nums = [3, 3, 6, 1]

Output: 6

Explanation: The largest element in array is 6

Example 2

Input: nums = [3, 3, 0, 99, -40]

Output: 99

Explanation: The largest element in array is 99

*/

package Arrays.Easy;

import java.util.*;

public class LargestElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(largestElement(arr));

    }

    public static int largestElement(int[] arr){
        int max = arr[0];

        for(int i = 1; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }

}


// O(n) && O(1)
