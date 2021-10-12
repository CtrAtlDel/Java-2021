package com.company;

public class List_int {
    public List_int.Node head;
    private int length;

    private static class Node {
        int data;
        List_int.Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public List_int() {
        this.length = 0;
        this.head = null;
    }

    public List_int(int size) {
        if (size > 0) {
            this.length = size;
            this.head = new List_int.Node(0);
            List_int.Node tmp = this.head;
            for (int i = 0; i < size - 1; i++) {
                tmp.next = new List_int.Node(0);
                tmp = tmp.next;
            }
        } else {
            this.length = 0;
            this.head = null;
        }
    }


    public void insert(int data) { //исходный лист
        List_int.Node new_node = new List_int.Node(data);
        new_node.next = null;
        if (this.head == null) { // список был изначально пуст
            this.head = new_node;
        } else {
            List_int.Node tmp = this.head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new_node;
        }
        this.length++;
    }

    public void deleteIndex(int index) {
        if (index >= this.length) {
            System.out.println("Index out of range");
        }
        if (this.length > 0) {
            if (index == 0) {
                this.head = this.head.next;
            } else {
                List_int.Node tmp = this.head;
                for (int i = 0; i < index; i++) {
                    tmp = tmp.next;
                }
                tmp = tmp.next;
            }
        }
    }

    public boolean isEmpty() {
        return this.length > 0;
    }

    public void setIndex(int index, int data) {
        if (index >= this.length) {
            System.out.println("Bad index");
        }
        List_int.Node tmp = this.head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        List_int.Node new_node = new List_int.Node(data);
        new_node.next = tmp.next;
        tmp.next = new_node;
    }

    public int getElemByIndex(int index) {
        if (index >= this.length) {
            System.out.println("Index out of range");
            return -1;
        }
        List_int.Node tmp = this.head;
        for (int i = 0; i <= index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getIndexByelem(int data) {
        List_int.Node tmp = this.head;
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
        List_int.Node tmp = this.head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
    }

    public List_int merge(Node head1, Node head2) {
        if (head1 == null && head2 == null) {
            System.out.println("Empty heads...");
            return null;
        }
        List_int new_list = new List_int();
        Node tmp1 = head1;
        Node tmp2 = head2;
        while (tmp1 != null && tmp2 != null) {
            if (tmp1.data <= tmp2.data) {
                new_list.insert(tmp1.data);
                tmp1 = tmp1.next;
            } else {
                new_list.insert(tmp2.data);
                tmp2 = tmp2.next;
            }
        }
        if (tmp2 == null) {
            while (tmp1 != null) {
                new_list.insert(tmp1.data);
                tmp1 = tmp1.next;
            }
            return new_list;
        }
        if (tmp2 != null && tmp1 == null){
            while (tmp2 != null) {
                new_list.insert(tmp2.data);
                tmp2 = tmp2.next;
            }
            return new_list;
        }
        return new_list;
    }
}
