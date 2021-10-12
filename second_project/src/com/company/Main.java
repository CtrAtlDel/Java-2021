package com.company;

public class Main {
    public static void main(String[] args) {
        Mapp<Integer, String> map = new Mapp<>();
        List_int list1 = new List_int();
        List_int list2 = new List_int();
        list1.insert(1);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);
        list1.insert(6);
        list2.insert(7);
        list2.insert(8);
        list2.insert(9);
        list2.insert(10 );
        List_int list_merge = list1.merge(list1.head, list2.head) ;
        list_merge.print();
    }
}
