package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Arrays arr = new Arrays();
        ArraysList arrList = new ArraysList();
        MapAndHashMap map1 = new MapAndHashMap();

        System.out.println("Arrays");
        arr.arrayDetails();
        System.out.println();
        System.out.println();

        System.out.println("Array Lists");
        arrList.arrayListDetails();
        System.out.println();
        System.out.println();

        System.out.println("Maps");
        map1.mapDetails();

    }
}