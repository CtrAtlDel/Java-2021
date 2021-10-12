package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        list2.insert(10);
        List_int list_merge = list1.merge(list1.head, list2.head);
        list_merge.print();
/*        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] str_sp = str.split(" ");
        System.out.println(str);
        Mapp<String, Integer> map = new Mapp<>();
        System.out.println("Length:" + str_sp.length);
        for (int i = 0; i < str_sp.length; i++) {
            map.put(str_sp[i], 1);
            if (){

            }else{

            }
        }*/
    }
}
