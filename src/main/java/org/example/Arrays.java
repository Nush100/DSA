package org.example;

public class Arrays {

    //Initialize
    String[] names = new String[4];
    String[] names2 = {"Jho", "Eric", "Kevin", "Davin"};

    //to print the array
    void printArray(String[] arr){
        for(int i=0; i<arr.length; i++){
            if(i != arr.length-1){
                System.out.print(arr[i] + ", ");
            }
            else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }

    //other methods
    void arrayDetails(){
        printArray(names2);
        System.out.println();

        System.out.println("Array length -> names2.length = "+ names2.length);
        System.out.println("Cannot add elements to array - fixed size");
        System.out.println("Cannot remove elements from array - fixed size");

        System.out.println();
        names2[0] = "Nush";
        System.out.println("Set an element -> names2[0]=\"Nush\" " );

        printArray(names2);
        System.out.println("Print Array -> System.out.print(names2) : " + names2 + " Wrong. Need to use a for loop to get the correct answer");
    }
}
