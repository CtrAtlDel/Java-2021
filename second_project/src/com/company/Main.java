package com.company;

public class Main {

    public static void main(String[] args) {
        List<Object> list = new List(5);
        list.insert(5, list);
        list.print(list);
    }
}
