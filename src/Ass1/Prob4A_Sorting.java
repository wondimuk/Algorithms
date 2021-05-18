package Ass1;

import java.util.ArrayList;

public class Prob4A_Sorting {
    public static void sortAsc(ArrayList<Integer> list){
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
        ArrayList<Integer> a =new ArrayList<>();
        a.add(5);a.add(6);a.add(2);a.add(1);
        sortAsc(a);
        System.out.println(a);

        ArrayList<Integer> b =new ArrayList<>();
        b.add(1);
        System.out.println(b);



    }

}
