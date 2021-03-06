package com.company;

public class List<T> {
    public Node<T> head;
    private int length;

    /**
     * @param <Object> - type of element
     */
    static class Node<Object> {
        Object data;
        Node<Object> next;

        /**
         * @param data - value of element
         */
        public Node(Object data) {
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
     * @param size - size of List
     */
    public List(int size) {
        if (size > 0) {
            this.length = size;
            this.head = new Node<>(null);
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
     * @param data - value of element
     */
    public void insert(T data) {
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
     * @param index - index of element
     */
    public void deleteIndex(int index) {
        if (index >= this.length || index < 0) {
            System.out.println("Index out of range");
            return;
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
            this.length -= 1;
        }
    }

    /**
     * @return true if we have element insaid else false
     */
    public boolean isEmpty() {
        return this.length == 0;
    }

    /**
     * input data by index
     *
     * @param index index of element
     * @param data  value of elemet
     * @return null if index out of range,
     */
    public void setIndex(int index, T data) {
        if (index >= this.length || index < 0) {
            return;
        }
        Node<T> tmp = this.head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        Node<T> new_node = new Node<>(data);
        new_node.next = tmp.next;
        tmp.next = new_node;
        this.length++;
    }

    /**
     * @param index of elem in list
     * @return value[index]
     */
    public T getElemByIndex(int index) {
        if (index >= this.length || index < 0) {
            return null;
        }
        Node<T> tmp = this.head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    /**
     * @param data input value
     * @return index of data
     */
    public int getIndexByelem(T data) {
        Node<T> tmp = this.head;
        for (int i = 0; i < this.length; i++) {
            if (data.equals(tmp.data)) { //tmp.data == data)
                return i;
            }
            tmp = tmp.next;
        }
        return -1;
    }

    /**
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
