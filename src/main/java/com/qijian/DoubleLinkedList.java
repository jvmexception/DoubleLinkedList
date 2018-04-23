package com.qijian;

public class DoubleLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;

    /**
     * 队尾追加元素
     *
     * @param e
     */
    public void add(E e) {
        Node<E> t = tail;
        Node<E> node = new Node<E>(t, e, null);
        tail = node;
        if (t == null) {
            head = node;
        } else {
            t.setNext(node);
        }
    }

    /**
     * 链表翻转
     * @param doubleLinkedList
     * @return
     */
    public DoubleLinkedList<E> reverseList(DoubleLinkedList<E> doubleLinkedList){
        Node<E> oldListHead = doubleLinkedList.getHead();//先保存老链表头
        Node<E> newHead = null;//声明新链表头
        while(oldListHead!=null){
            //构造新节点
            Node<E> newNode = new Node<E>(null,oldListHead.getE(),newHead);
            if(newHead==null){
                //如果头结点为空则为新链表中唯一一个节点
                doubleLinkedList.setTail(newNode);
            }else{
                //如果不为则指明前驱
                newHead.setPrev(newNode);
            }
            newHead = newNode;//将指针前移
            doubleLinkedList.setHead(newHead);
            oldListHead = oldListHead.next();
        }
        return doubleLinkedList;
    }

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public Node<E> getTail() {
        return tail;
    }

    public void setTail(Node<E> tail) {
        this.tail = tail;
    }

}
