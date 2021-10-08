package com.company;

public class List<T> {
    public Node<T> head;
    private int length;

    /**
     *
     * @param <T> - type of element
     */
    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * empty constructor
     */
    public List() {
        this.length = 0;
        this.head = null;
    }

    /**
     *
     * @param size - size of List
     */
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

    /**
     *
     * @param data
     */
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

    /**
     *
     * @param index - index of element
     * @return
     */
    public void deleteIndex(int index) {
        if (index >= this.length) {
            System.out.println("Index out of range");
        }
        if (this.length > 0) {
            if (index == 0) {
                this.head = this.head.next;
            } else {
                Node<T> tmp = this.head;
                for (int i = 0; i < index; i++) {
                    tmp = tmp.next;
                } 
                tmp = tmp.next;
            }
        }
    }

    /**
     *
     * @return true if we have element insaid else false
     */
    public boolean isEmpty() {
        return this.length > 0;
    }

    /**
     * input data by index
     * @param index index of element
     * @param data value of elemet
     * @return null if index out of range,
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

    /**
     *
     * @param index of elem in list
     * @return value[index]
     */
    public T getElemByIndex(int index) {
        if (index >= this.length) {
            return null;
        }
        Node<T> tmp = this.head;
        for (int i = 0; i <= index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    /**
     *
     * @param data input value
     * @return index of data
     */
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

    /**
     *
     * @return size of List
     */
    public int getLength() {
        return this.length;
    }

    /**
     * print all elements of list
     */
    public void print() {
        Node<T> tmp = this.head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }
}
