package com.company;

public class Main {

    public static void main(String[] args) {
        List arr = new List(5);
        for (int i = 0; i < 7; i++){
            arr.insert(i);
        }
        arr.printList();
    }
}
