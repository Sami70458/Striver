package Strings.Easy;

public class ValidAnagram {
    public static void main(String[] args){
        String s1 = "racecar";
        String s2 = "rcaacre";

        boolean ans = true;

        if(s1.length()!=s2.length()){
            ans = false;
        }

        int[] count = new int[26];

        for(char c : s1.toCharArray()){
            count[c-97]++;
        }

        for(char c : s2.toCharArray()){
            count[c-97]--;
        }

        for(int val : count){
            if(val!=0){
                ans = false;
                break;
            }
        }

        System.out.println(ans);
    }
}


/*

Time Complexity:

Best Case: O(n)

Average Case: O(n)

Worst Case: O(n)

(n = length of the strings s1 and s2)

Reason:

Counting characters in s1 → O(n)

Updating counts using s2 → O(n)

Final check of array of size 26 → O(26) ≈ O(1)

Space Complexity:

Auxiliary Space: O(1) (fixed-size array of 26 elements)

                       */
