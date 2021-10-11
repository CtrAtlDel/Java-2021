package com.company;

public class Main {
    public static void main(String[] args) {
        Mapp<Integer, Integer> map = new Mapp<>();
        map.put(1, 2);
        Object res = map.get(1);
        System.out.println("res:" + res);
    }
}
