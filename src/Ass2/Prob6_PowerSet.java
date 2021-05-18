package Ass2;

import java.util.*;

public class Prob6_PowerSet {

    public static List<Set<Integer>> powerSet(List<Integer> list) {
        List<Set<Integer>> sets = new ArrayList<>();
        if (list.isEmpty()) {
            sets.add(new HashSet<Integer>());
            return sets;
        }

        Integer head = list.get(0);
        List<Integer> rest = new ArrayList(list.subList(1, list.size()));
        for (Set<Integer> set : powerSet(rest)) {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }

        public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5));
        System.out.println( powerSet(list));
    }
}

