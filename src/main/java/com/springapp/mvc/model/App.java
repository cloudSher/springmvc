package com.springapp.mvc.model;

/**
 * Created by Administrator on 2016/9/9.
 *
 *  fire countdown launch
 */
public class App {

    public static void main(String args[]){
        Node node = new Node();
        node.setData("start");
        Controller con = new Controller(node);

    }
}
