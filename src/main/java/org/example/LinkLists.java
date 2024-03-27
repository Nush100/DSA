package org.example;

import java.util.LinkedList;

public class LinkLists {

    //Initialize
    LinkedList<String> namesLinkedList = new LinkedList<>();

    void linkListDetails(){
        namesLinkedList.add("Jho");
        namesLinkedList.add("Eric");
        namesLinkedList.add("Jim");
        namesLinkedList.add("Timmy");
        System.out.println(namesLinkedList);
        System.out.println();


        System.out.println("LinkedList length -> namesLinkedList.size() = "+ namesLinkedList.size());
        namesLinkedList.add("New value");
        System.out.println("Add element -> namesLinkedList.add(\"New Value\")");
        System.out.println(namesLinkedList);
        System.out.println();

        namesLinkedList.remove("Eric");
        System.out.println("Remove element -> namesLinkedList.remove(\"Eric\")");
        System.out.println(namesLinkedList);
        System.out.println();

        namesLinkedList.set(0,"Nush");
        System.out.println("Set an element -> namesLinkedList.set(0,\"Nush\")" );
        System.out.println(namesLinkedList);
        System.out.println();

        System.out.println("Print linedList -> System.out.print(namesLinkedList) : " + namesLinkedList );
    }
}
