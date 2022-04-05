package com.test.spring5;


import java.util.ArrayList;
import java.util.Arrays;

public class User {
    public void add(){
        System.out.println("add..........");
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println("1");
        String[] s = new String[]{"1","2","3"};
        for (String value : s) {
            System.out.println(value);

        }
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
