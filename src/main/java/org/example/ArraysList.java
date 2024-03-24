package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList {

    //Initialize
    ArrayList<String> names = new ArrayList<>();
    ArrayList<String> namesList = new ArrayList<>(Arrays.asList("Jhon", "Eric", "Kevin", "Davin"));

    //other methods
    void arrayListDetails(){
        System.out.println(namesList);
        System.out.println();

        System.out.println("ArrayList length -> namesList.size() = "+ namesList.size());
        namesList.add("New value");
        System.out.println("Add element -> namesList.add(\"New Value\")");
        System.out.println(namesList);
        System.out.println();

        namesList.remove("Eric");
        System.out.println("Remove element -> nameList.remove(\"Eric\")");
        System.out.println(namesList);
        System.out.println();

        namesList.set(0,"Nush");
        System.out.println("Set an element -> namesList.set(0,\"Nush\")" );
        System.out.println(namesList);
        System.out.println();

        System.out.println("Print Array -> System.out.print(namesList) : " + namesList );
    }
}
