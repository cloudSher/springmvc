package com.springapp.mvc.model;

/**
 * Created by Administrator on 2016/9/9.
 */
public class ConditionNode {


    private Node node;


    public boolean isCondition(){
        if(node.isCondition()){
            return true;
        }
        return false;
    }

    public boolean condition(){
        return true;
    }

}
