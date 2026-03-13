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
