package com.company;

class List {
    int[] list;
    int length;
    List(){
        this.length = 0;
        this.list = new int[16];
    }
    List(int n) {
        this.length = n;
        this.list = new int[n];
    }
    void insert(int x){
        if (this.length <= 0) { //if first elem
            this.list[this.length] = x;
            this.length++;
        }
        int temp[] = copyOf(this.list, this.length +1);//длина текущего массива + 1
        ++this.length;
        this.list = temp;
        list[this.length - 1] = x;
    }
    private int[] copyOf(int[] list, int i) {
        int size = i + 16;
        int[] copy = new int[size];
        for (int j = 0; j < i - 1; ++j){
            copy[j] = list[j];
        }
        copy[i - 1] = 0;
        return copy;
    }

    boolean isEmpty(){
        return this.length <= 0;
    }
    void printList(){
        for (int i = 0; i < this.length; ++i){
            System.out.println(this.list[i]);
        }
    }
}
