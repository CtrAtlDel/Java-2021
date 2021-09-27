package com.company;

public class Node<T>{
    T data;
    private Node<T> parent;
    private List<Node<T>> children; // массив ссылок на узлы
    private static  int maxchild;

    public Node(T data){
        this.data = data;
        this.children = new List<Node<T>>(maxchild);

    }

}
