package com.company;

public class Main {
    public static void main(String[] args) {
        List_int list1 = new List_int();
        List_int list2 = new List_int();
        list1.insert(1);
        list1.insert(5);
        list1.insert(10);
        list1.insert(15);
        list2.insert(2);
        list2.insert(14);
        List_int list_merge = list1.merge(list1.head, list2.head) ;
        list_merge.print();
    }
}
