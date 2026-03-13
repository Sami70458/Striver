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
