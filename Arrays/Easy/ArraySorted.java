package Arrays.Easy;

import java.util.*;

public class ArraySorted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        for(int i = 0; i<n; i++){
            nums.add(sc.nextInt());
        }

        System.out.println(sorted(nums));

    }

    public static boolean sorted(ArrayList<Integer> nums){
        boolean ans = true;
        
        for(int i = 1; i<nums.size();i++){
            if(nums.get(i)<nums.get(i-1)){
                return false;
            }
        }


        // O(n) && O(1)

        return ans;
    }
}

