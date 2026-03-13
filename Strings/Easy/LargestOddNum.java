package Strings.Easy;
import java.util.*;


public class LargestOddNum {
    public static void main(String[] args) {
        String num = "123466";

        int n = num.length()-1;

        String ans = "";

        while(n>0){
            int d = num.charAt(n) - '0';

            if(d%2!=0){
                ans = ans + num.substring(0,n+1);
                break;
            }

            n--;
        }

        System.out.println(ans);
    }
}

/*

Time Complexity:

Best Case: O(1) (if the last digit is odd)

Worst Case: O(n) (if we have to scan all digits)

Average Case: O(n)

Space Complexity:

Auxiliary Space: O(n) (for the substring storage in ans)

    */

