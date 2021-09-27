package com.company;

class List<T> {
    private Node<T> head;
    private int length;

    static class Node<T>{
        T data;
        Node<T> next;
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    public List(){
        this.length = 0;
        this.head = null;
    }

    public List(int size){
        this.length = size;
        this.head = null;
        for (int i = 0; i < size; i++){

        }
    }

    public List<T>

    private List<T> insert(T data, List<T> list){ //исходный лист
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null){ // список был изначально пуст
            list.head = new_node;
        }else{
            Node<T> tmp = list.head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new_node;
        }
        this.length++;
        return list;
    }

//    public void append(T data){
//        Node<T> new_node = new Node(data);
//        new_node.next = this.head;
//        this.head = new_node;
//        this.length++;
//    }

    public void prepend(T data) {
        Node<T> new_node = new Node(data);
        Node<T> tmp = this.head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = new_node;
        this.length++;
    }

    public T getIndex(int index, List<T> list){
        Node<T> tmp = list.head;
        for (int i = 0; i <= index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getLength(List<T> list){ return this.length; }

    public static void print(List<T> list){
        Node<T> tmp = list.head;
        while(tmp != null){
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }

}
