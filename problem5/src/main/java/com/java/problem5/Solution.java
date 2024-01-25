package com.java.problem5;

import java.util.*;

public class Solution {
    public List<Integer> dishPrepareOrder(List<Integer> orderList){
        List<Integer> dishList = new ArrayList<>();
        Map<Integer, Integer> dishOrdermap = new HashMap<>();
        for(int i : orderList){
            dishOrdermap.put(i, dishOrdermap.getOrDefault(i, 0)+ 1);
        }
        List<Pair> list= new ArrayList<>();
        for(int i : dishOrdermap.keySet()){
            Pair pair= new Pair(i, dishOrdermap.get(i));
            list.add(pair);
        }
        Collections.sort(list, (o1, o2) -> {
            int result = o2.orders - o1.orders;
            if(result == 0){
                return o1.dishId - o2.dishId;
            }
            return result;
        });
        for(Pair pair : list){
            dishList.add(pair.dishId);
        }
        return dishList;
    }
}
