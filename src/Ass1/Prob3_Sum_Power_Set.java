package Ass1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import Ass2.Prob6_PowerSet;
/*
* This code is not yet completed.
* */

public class Prob3_Sum_Power_Set {
    public static boolean sumFound(List<Integer> list, int k) {
        if(list.isEmpty()) return false;
        int sumRes=0;
        for(Integer elem:list){
            sumRes+=elem;
        }
        if(sumRes<k) return false;

        List<Set<Integer>> powerSet= Prob6_PowerSet.powerSet(list);

        sumRes=0;
        for(Set<Integer> subset:powerSet){
            for(Integer ele:subset){
                if(sumRes<=k) {
                    sumRes += ele;
                }
            }
            if(sumRes==k) return true;
            sumRes=0;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a ={1, 3, 9, 4, 8, 5};
        List<Integer> givenArray=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            givenArray.add(a[i]);
        }
        sumFound(givenArray,21);
    }
}
