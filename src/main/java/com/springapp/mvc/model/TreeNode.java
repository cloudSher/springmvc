package com.springapp.mvc.model;

/**
 * Created by Administrator on 2016/9/9.
 */
public class TreeNode
{

    private Node head;
    private Node next;
    private int size;           //node size
    private int modCount;       //modify count

    public TreeNode(Node node){
        if(head == null){
            this.head = node;
        }

    }


    public void getNode(Node node){
        while (next != null){
            next = next.getNext();
        }


    }



}
