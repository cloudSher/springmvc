package com.springapp.mvc.model;

/**
 * Created by Administrator on 2016/9/9.
 *
 *  state node
 *
 */
public class Node {

    private Object data;
    private Node next;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean isParsent(){
        if(next != null){
            return true;
        }
        return false;
    }

    public boolean isCondition(){
        if(next == null){
            return true;
        }
        return false;
    }

    public void work(Controller con){
        
    }
}
