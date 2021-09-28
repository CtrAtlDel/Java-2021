package com.company;

public class List<T> {
    public Node<T> head;
    private int length;

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public List() {
        this.length = 0;
        this.head = null;
    }

    public List(int size) {
        if (size > 0) {
            this.length = size;
            this.head = new Node<T>(null);
            Node<T> tmp = this.head;
            for (int i = 0; i < size - 1; i++) {
                tmp.next = new Node<>(null);
                tmp = tmp.next;
            }
        } else {
            this.length = 0;
            this.head = null;
        }
    }

    public void insert(T data) { //исходный лист
        Node<T> new_node = new Node<>(data);
        new_node.next = null;
        if (this.head == null) { // список был изначально пуст
            this.head = new_node;
        } else {
            Node<T> tmp = this.head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new_node;
        }
        this.length++;
    }

    public Object deleteIndex(int index, List<T> list) {
        if (index >= list.length) {
            return null;
        }
        if (list.isEmpty(list)) {
            if (index == 0) {
                list.head = list.head.next;
            } else {
                Node<T> tmp = list.head;
                for (int i = 0; i < index; i++) {
                    tmp = tmp.next;
                }
                tmp = tmp.next;
                return list;
            }
        } else {
            return list;
        }
        return list;
    }

    public boolean isEmpty(List<T> list) {
        if (list.length <= 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @param index
     * @param data
     * @return
     */
    public Object setIndex(int index, T data) {
        if (index >= this.length) {
            return null;
        }
        Node<T> tmp = this.head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        Node<T> new_node = new Node<>(data);
        new_node.next = tmp.next;
        tmp.next = new_node;
        return null;
    }

    public T getElembyIndex(int index) {
        if (index >= this.length) {
            return null;
        }
        Node<T> tmp = this.head;
        for (int i = 0; i <= index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getIndexByelem(T data) {
        Node<T> tmp = this.head;
        for (int i = 0; i < this.length; i++) {
            if (tmp.data == data) {
                return i;
            }
            tmp = tmp.next;
        }
        return -1;
    }

    public int getLength() {
        return this.length;
    }

    public void print() {
        Node<T> tmp = this.head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }
}
