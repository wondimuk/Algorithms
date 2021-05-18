package Ass1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class Prob4B_Sorting {

    public static void sortAsc(LinkedList<Integer> list){
        if(list.isEmpty() && list.size()<2) return;
        int len = list.size();
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(list.get(i)>list.get(j)){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 3, 9, 4, 8, 5));
        sortAsc(linkedList);
        System.out.println(linkedList.toString());
    }
}
