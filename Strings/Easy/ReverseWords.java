package Strings.Easy;
import java.util.*;

public class ReverseWords {
    public static void main(String[] args) {
        String s = " Hello World Kemcho ";

        s.trim();

        String[] str = s.split(" ");

        String result = "";

        for(int i = str.length-1; i>=0; i--){
            result = result + str[i];
            if(i>0){
                result = result + " ";
            }
        }

        System.out.println(result);
    }
}

/*

Time Complexity:

Best Case: O(n)

Worst Case: O(n²)

Average Case: O(n²)

Reason:

s.split(" ") → O(n)

Concatenating strings in the loop (result = result + str[i]) → each concatenation creates a new string → total O(n²) in the worst case.

Space Complexity:

Auxiliary Space: O(n)

For the split array (str) and the final string result.

Note: Using StringBuilder for concatenation can reduce Time Complexity to O(n).

    */
