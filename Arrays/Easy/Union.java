package Arrays.Easy;
import java.util.*;

public class Union {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,5,6,7,8};

        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0;

        List<Integer> union = new ArrayList<>();

        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else if(arr2[j] < arr1[i]){
                if(union.isEmpty() || union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
            else{
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while(i < n){
            if(union.isEmpty() || union.get(union.size()-1) != arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }

        while(j < m){
            if(union.isEmpty() || union.get(union.size()-1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }

        for(int k = 0; k < union.size(); k++){
            System.out.print(union.get(k) + " ");
        }
    }
}