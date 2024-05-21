package com.exapi.collectionframeworks.implement;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImplementation {
    public static void main(String[] args) {
        /*
        Elements always sorted
        no get(int index) method here to get by index
         */
    Set<String> cities=new TreeSet<>();
        cities.add("Dhaka");
        cities.add("Tangail");
        cities.add("Mymensing");
        cities.add("Comilla");
        cities.add("Comilla");

        System.out.println("Total cities "+cities.size());          // 4
        System.out.println(cities);             //[Comilla, Dhaka, Mymensing, Tangail]

//
}
}
