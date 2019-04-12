package com.example.springcloud.eurekaclient1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        List<String> list1 = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add(1,"5");
        list.remove(1);
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals("2"))
                list.remove(i);
        }
        System.out.println(list.toString());
    }
}
