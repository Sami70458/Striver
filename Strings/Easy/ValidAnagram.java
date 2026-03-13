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
