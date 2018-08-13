package com.dusaneinfotech;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    List<Integer> mystack;
    MyStack(){
        mystack = new ArrayList<Integer>();
    }
    public void push(Integer n){
        if(mystack.size() >= 10)
            mystack.clear();
        mystack.add(n);
    }
    public  Integer top(){
        return mystack.get(0);
    }
    public Integer pop(){
        Integer ret = mystack.get(0);
        mystack.remove(0);
        return ret;
    }
    public int getCount(){
        return mystack.size();
    }
}
