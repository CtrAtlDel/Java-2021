package com.company;

class List<T> {
    private final T[] list;
    private final int length;

    List(){
        this.length = 0;
        this.list = new T[16];
    }

    List(int size) {
        this.length = size;
        this.list = new int[size];
    }

    public int length(){return this.length;}

    public void insert(int x){
        if (this.length <= 0) { //if first elem
            this.list[this.length] = x;
            this.length++;
        }
        int temp[] = copyOf(this.list, this.length +1);//длина текущего массива + 1
        ++this.length;
        this.list = temp;
        list[this.length - 1] = x;
    }

    //???
    private int[] copyOf(int[] list, int i) {
        int size = i + 16;
        int[] copy = new int[size];
        for (int j = 0; j < i - 1; ++j){
            copy[j] = list[j];
        }
        copy[i - 1] = 0;
        return copy;
    }

    public boolean isEmpty(){
        return this.length <= 0;
    }

    public void printList(){
        for (int i = 0; i < this.length; ++i){
            System.out.println(this.list[i]);
        }
    }
}
