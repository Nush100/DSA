package org.example;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {

    //Initialize
    Set<String> namesSet = new HashSet<>();

    void setDetails(){
        namesSet.add("Jho");
        namesSet.add("Eric");
        namesSet.add("Jim");
        namesSet.add("Timmy");
        System.out.println(namesSet);
        System.out.println();

        namesSet.add("Anne");
        System.out.println("Add element -> namesSet.add(\"Anne\")");
        System.out.println(namesSet);

        namesSet.add("Anne");
        System.out.println("Add same element again-> namesSet.add(\"Anne\") -- No change. Duplicates are not added.");
        System.out.println(namesSet);
        System.out.println();

        System.out.println("Contains Value? -> namesSet.contains(\"Eric\") : Answer = " + namesSet.contains("Eric"));
        System.out.println("Is empty? -> namesSet.isEmpty() : Answer = " + namesSet.isEmpty());
        System.out.println();

        namesSet.remove("Jho");
        System.out.println("Remove element -> namesSet.remove(\"Jho\")");
        System.out.println(namesSet);
        System.out.println();

        //To loop through the set
        //Method1
        for(String name : namesSet){
            System.out.println(name);
        }
        System.out.println();

        //Method 2 - Using Iterator
        Iterator<String> names = namesSet.iterator();
        while (names.hasNext()){
            System.out.println(names.next());
        }
        System.out.println();

        //Method 3 - Using lambda function
        namesSet.forEach(System.out::println);
        System.out.println();

        namesSet.clear();
        System.out.println("To clear set -> namesSet.clear()");
        System.out.println(namesSet);
        System.out.println();
    }

}
