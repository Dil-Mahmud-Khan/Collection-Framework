package com.exapi.collectionframeworks.implement;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImplement {
    public static void main(String[] args) {

        List<String> emperors=new ArrayList<>();
        emperors.add("John");
        emperors.add("Jane");
        emperors.add("Bob");
        emperors.add("Humayun");
        emperors.add("Hasib");

        System.out.println("Name of emperors"+emperors);           // Name of emperors[John, Jane, Bob, Humayun, Hasib]
        System.out.println("Number of emperors " + emperors.size());   //5
        System.out.println("Second Emperor"+emperors.get(1));           //Jane

        //Let's change the name of Bob
        emperors.set(2,"Bobby");
        System.out.println("Name of emperors"+emperors);                             //Name of emperors[John, Jane, Bobby, Humayun, Hasib]

        //Remove 4th element
        emperors.remove(3);
        //Remove Hasib
        emperors.remove("Hasib");
        System.out.println("After removing some emperors"+emperors);                //After removing some emperors[John, Jane, Bobby]

        //Add duplicated
        emperors.add("John");
        System.out.println("After add element "+ emperors);                         //After add element [John, Jane, Bobby, John]

        System.out.println("Index of Bobby "+emperors.indexOf("Bobby"));            //Index of Bobby 2

        System.out.println("Last index of duplicate one "+emperors.lastIndexOf("John"));   //Last index of duplicate one 3
    }
}
