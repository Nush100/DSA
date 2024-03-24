package org.example;

import java.sql.SQLOutput;
import java.util.HashMap;

public class MapAndHashMap {

    //Initialize
    HashMap<String, Integer> students = new HashMap<>();

    //other methods
    void mapDetails(){
        students.put("Eric", 45678);
        students.put("Kevin", 56734);
        System.out.println(students);
        System.out.println();

        students.put("Jho", 12345);
        System.out.println("Add element -> students.put(\"Jho\", 12345)");
        System.out.println(students);
        System.out.println();

        System.out.println("Get a value -> students.get(\"Eric\") : Answer =" + students.get("Eric"));
        System.out.println("Contains Key? -> students.containsKey(\"Eric\") : Answer = " + students.containsKey("Eric"));
        System.out.println("Contains value -> students.containsValue(12345) : Answer = " + students.containsValue(12345));
        System.out.println();

        students.put("Jho", 99999);
        System.out.println("Add element, if key exists replace the value  -> students.put(\"Jho\", 99999)");
        System.out.println(students);
        System.out.println();

        students.replace("Jho", 77788);
        System.out.println("Replace Element, if key not exist, do nothing -> students.put(\"Jho\", 77788)");
        System.out.println(students);
        System.out.println();

        students.putIfAbsent("Neil", 45675);
        System.out.println("Add element if key do not exist-> students.put(\"Neil\", 45675)");
        System.out.println(students);
        System.out.println();

        students.remove("Jho");
        System.out.println("Remove element -> students.remove(\"Jho\")");
        System.out.println(students);
        System.out.println();
    }

}
