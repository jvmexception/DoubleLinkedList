package com.qijian;

import org.junit.Assert;
import org.junit.Test;

public class DoubleLinkedListTest {

    /**
     * 反转链表后从头开始读
     */
    @Test
    public void reverseListHead() {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);

        Node<Integer> node = doubleLinkedList.getHead();
        while (node != null) {
            node = node.next();
        }
        DoubleLinkedList<Integer> newList = new DoubleLinkedList<Integer>().reverseList(doubleLinkedList);

        Node<Integer> newNode = newList.getHead();
        int[] array = new int[3];
        int i=0;
        while (newNode != null) {
            array[i++] = newNode.getE();
            newNode = newNode.next();
        }
        Assert.assertArrayEquals("reverseListHead:not equal",new int[]{3,2,1},array);
    }

    /**
     * 反转链表后从尾开始读
     */
    @Test
    public void reverseListTail() {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);

        Node<Integer> node = doubleLinkedList.getHead();

        while (node != null) {

            node = node.next();
        }
        DoubleLinkedList<Integer> newList = new DoubleLinkedList<Integer>().reverseList(doubleLinkedList);

        Node<Integer> newNode = newList.getTail();
        int[] array = new int[3];
        int i=0;
        while (newNode != null) {
            array[i++] = newNode.getE();
            newNode = newNode.prev();
        }
        Assert.assertArrayEquals("reverseListTail:not equal",new int[]{1,2,3},array);
    }

    /**
     * 添加元素
     */
    @Test
    public void add() {
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<Integer>();
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);

        Node<Integer> node = doubleLinkedList.getHead();
        int[] array = new int[3];
        int i=0;
        while (node != null) {
            array[i++] = node.getE();
            node = node.next();
        }
        Assert.assertArrayEquals("add:add failed",new int[]{1,2,3},array);
    }

}
