package com.company;


import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List_int list1 = new List_int();
//        List_int list2 = new List_int();
//        list1.insert(1);
//        list1.insert(5);
//        list1.insert(10);
//        list1.insert(15);
//        list1.insert(20);
//        list2.insert(3);
//        list2.insert(6);
//        list2.insert(13);
//        list2.insert(14);
//        List_int list_merge = list1.merge(list1.head, list2.head);
//        list_merge.print();
        task_1();
    }
    public static void task_1(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] elements = line.split(" ");
        for (String elem : elements){
            if(map.containsKey(elem)){
                map.put(elem, map.get(elem) + 1);
            }else{
                map.put(elem, 1);
            }
        }
        Set<String> set = map.keySet();
        Collection<Integer> collection = map.values();
        for (String elem : set){
            System.out.print(elem + " ");
        }
        System.out.println();
        for (Integer elem: collection){
            System.out.print(elem + " ");
        }
        System.out.println();

    }
}
