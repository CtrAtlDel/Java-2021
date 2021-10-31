package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Mapp<Integer, Integer> mapp = new Mapp<>();
        int size = mapp.size();
        boolean test = mapp.isEmpty();
        System.out.println("test: " + test);
        mapp.put(1, 1);
        mapp.put(2, 2);
        mapp.put(3, 3);
        int get = mapp.get(1);
        boolean count = mapp.keyContains(1);
        System.out.println("Is contains: " + count);
        count = mapp.keyContains(4);
        System.out.println("Is contains: " + count);
        test = mapp.isEmpty();
        System.out.println("test: " + test);
    }

    public static void task_1() {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder str = new StringBuilder();
        String[] elements = line.split(" ");
        for (String elem : elements) {
            if (map.containsKey(elem)) {
                map.put(elem, map.get(elem) + 1);
            } else {
                map.put(elem, 1);
                str.append(elem).append(" ");
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + " Value: " + value);
        }
//        Set<String> set = map.keySet();
//        Collection<Integer> collection = map.values();
//        for (String elem : set){
//            System.out.print(elem + " ");
//        }
//        System.out.println();
//        for (Integer elem: collection){
//            System.out.print(elem + " ");
//        }
//        System.out.println();
        System.out.println(str);
    }
}
