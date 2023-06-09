package com.yzx.linear.Link.SingleList;

/**
 * @Author YZX
 * @Create 2023-04-13 10:22
 * @Java-version jdk1.8
 */
//用来定义节点
public class Node<T> {
    //存储数据
    public T item;
    //下一个节点
    public Node next;

    public Node(T item, Node next) {
        this.item = item;
        this.next = next;
    }
}
