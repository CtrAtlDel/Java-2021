package com.company;

class List<T> {
    public Node<T> head;
    private int length;
    static class Node<T>{
        T data;
        Node<T> next;
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    public List(){
        this.length = 0;
        this.head = null;
    }
    public List(int size){
        if (size > 0){
            this.length = size;
            this.head = new Node<T>(null);
            Node<T> tmp = this.head;
            for(int i = 0; i < size - 1 ; i++){
                Node<T> new_node = new Node<T>(null);
                tmp.next = new_node;
                tmp = tmp.next;
            }
        }
    }
    public List<T> insert(T data, List<T> list){ //исходный лист
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
    public void prepend(T data) {
        Node<T> new_node = new Node(data);
        Node<T> tmp = this.head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = new_node;
        this.length++;
    }
    public Object deleteIndex(int index, List<T> list ){
        if (index >= list.length){
            return null;
        }
        if (list.isEmpty(list)){
            if (index == 0){
                list.head = list.head.next;
            }else{
                Node<T> tmp = list.head;
                for (int i = 0; i < index; i++){
                    tmp = tmp.next;
                 }
                tmp = tmp.next;
                return list;
            }
        }
        else{
            return list;
        }
        return list;
    }
    public boolean isEmpty(List<T> list){
        if (list.length <= 0){return false;}
        else{return true;}
    }
    public Object  setIndex(int index, T data){
        if (index >= this.length){
            return null;
        }
        Node<T> tmp = this.head;
        for (int i = 0 ; i < index; i++){
            tmp = tmp.next;
        }
        Node<T> new_node = new Node<T>(data);
        new_node.next = tmp.next;
        tmp.next = new_node;
        return null;
    }
    public T getElembyindex(int index, List<T> list){
        if (index >= this.length) {
            return null;
        }
        Node<T> tmp = list.head;
        for (int i = 0; i <= index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int getIndexbyelem(T data, List<T> list) {
        Node<T> tmp = list.head;
        for (int i = 0; i< this.length; i++ ){
            if (tmp.data == data){return i;}
            tmp = tmp.next;
        }
        return -1;
    }
    public int getLength(List<T> list){ return this.length; }
    public void print(List<T> list) {
        Node<T> tmp = list.head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }
}
