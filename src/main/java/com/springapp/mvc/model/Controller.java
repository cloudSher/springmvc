package com.springapp.mvc.model;

/**
 * Created by Administrator on 2016/9/9.
 *
 *  controller node is parsentNode to control
 */
public class Controller {

    private Node node;


    Controller(Node node){
        this.node = node;
    }


    public boolean isControl(){
        if(node.isParsent()){
            return true;
        }
        return false;
    }

    public void work(){
        this.node.work(this);
    }





}
