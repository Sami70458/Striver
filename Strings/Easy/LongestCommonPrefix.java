package Strings.Easy;
import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        String res = arr[0];

        for(int i = 1; i<arr.length;i++){
            res = common(res,arr[i]);
        }

        System.out.println(res);
    }

    public static String common(String s1,String s2){
        int n = Math.min(s1.length(),s2.length());

        StringBuilder str = new StringBuilder();

        for(int i = 0; i<n; i++){
            if(s1.charAt(i)==s2.charAt(i)){
                str.append(s1.charAt(i));
            }else{
                return str.append(" ").toString();
            }
        }

        return str.toString();
    }
}
