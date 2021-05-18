package Ass1;

import java.util.Arrays;

public class Prob5_Search {
    public static boolean find(int[] arr, int z) {
        if(arr ==null) new IllegalArgumentException();
        int len = arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]==z){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a={2, 8, 3, 4};
        System.out.println(find(a,3));

        int[] b={2, 8, 3, 4};
        System.out.println(find(a,5));

        int[] c={2, 3, 4, 8};
        System.out.println(find(a,3));

        System.out.println(find(a,5));
    }
}
