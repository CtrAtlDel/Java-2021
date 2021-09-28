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

//    public void addChild(Node<T> childNode, int pos){ // pos - куда вставляем
//        if (pos >= maxchild - 1){//return null;}
//        else{
//            if (this.children.getIndex(pos,children) != null){
//                //return null;
//            }else{
//                childNode.parent = this;
//                this.children.setIndex(pos, childNode);
//            }
//        }
//    }

}
