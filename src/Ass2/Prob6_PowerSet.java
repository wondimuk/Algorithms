package Ass2;

import java.util.*;

public class Prob6_PowerSet {
    public static List<Set> powerSet(List list) {
        if(list.isEmpty() ){  //&& Prob6_PowerSet.checkDuplicate(list)
            return list;
        }
        List<Set> res=new ArrayList<Set>();
        Set subSet=new HashSet();

        int len = list.size();
        res.add(subSet);
        for(int i=0;i<len;i++){
            subSet.add(list.get(0));
            res.add(subSet);
            subSet.clear();
            for(int j=i;j>0;j--){
                subSet.add(list.get(j));
            }
            res.add(subSet);
            System.out.println(res);


        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);a.add(2);
        System.out.println(Prob6_PowerSet.powerSet(a));
    }

}
