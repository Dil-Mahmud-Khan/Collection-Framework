package com.exapi.collectionframeworks.implement;

import java.util.LinkedList;
import java.util.List;

public class LinkedListImplement {

    /*
    LinkedList is a data structure of Doubly LinkedList
     */
    public static void main(String[] args) {
        List<String> emperors=new LinkedList<>();
        emperors.add("John");
        emperors.add("Jane");
        emperors.add("Bob");
        emperors.add("Humayun");
        emperors.add("Hasib");
        boolean contains=emperors.contains("Bob");
        System.out.println(contains);
    }
}
