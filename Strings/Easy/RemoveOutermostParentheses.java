package Strings.Easy;
import java.util.*;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String str = "((()))";

        int count = 0;

        StringBuilder ans = new StringBuilder();

        for(char c : str.toCharArray()){
            if(c=='('){
                if(count>0){
                    ans.append(c);
                }
                count++;
            }else{
                count--;
                if(count>0){
                    ans.append(c);
                }
            }
        }

        System.out.println(ans.toString());
    }
}

/*
Time Complexity:

Best Case: O(n)

Worst Case: O(n)

Average Case: O(n)

Reason: Each character in the string is visited exactly once.

Space Complexity:

Auxiliary Space: O(n) – for the StringBuilder storing the result.
    */

