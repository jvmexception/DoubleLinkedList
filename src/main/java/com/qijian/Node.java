package com.qijian;

public class Node<E> {
    private E e;
    private Node<E> prev;

    public void setE(E e) {
        this.e = e;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    private Node<E> next;

    public Node(Node<E> prev, E e, Node<E> next) {
        this.prev = prev;
        this.e = e;
        this.next = next;
    }
    public Node<E> prev(){
        return this.prev;
    }
    public Node<E> next(){
        return this.next;
    }

    public E getE() {
        return e;
    }
}