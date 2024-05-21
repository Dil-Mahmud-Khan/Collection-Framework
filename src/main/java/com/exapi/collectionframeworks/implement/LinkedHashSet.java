package com.exapi.collectionframeworks.implement;

import java.util.HashSet;
import java.util.Set;

public class LinkedHashSet {

    public static  void main(String[] args){
        /*
    Je order e add hoy oi order ei thake
    duplicate thake na

     */

        Set<String> cities=new java.util.LinkedHashSet<>();
        cities.add("Dhaka");
        cities.add("Tangail");
        cities.add("Mymensing");
        cities.add("Comilla");
        cities.add("Comilla");

        System.out.println("Total cities "+cities.size());          // 4
        System.out.println(cities);             //[Dhaka, Tangail, Mymensing, Comilla]

//
    }
}
