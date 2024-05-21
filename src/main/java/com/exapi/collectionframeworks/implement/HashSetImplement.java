package com.exapi.collectionframeworks.implement;

import java.util.HashSet;
import java.util.Set;

public class HashSetImplement {
    public static  void main(String[] args){
        Set<String> cities=new HashSet<>();
        cities.add("Dhaka");
        cities.add("Tangail");
        cities.add("Mymensing");
        cities.add("Comilla");
        cities.add("Comilla");

        System.out.println("Total cities "+cities.size());          // 4
        System.out.println(cities);             //[Tangail, Mymensing, Comilla, Dhaka]

    }
}
