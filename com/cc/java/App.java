package com.cc.java;

import java.util.Arrays;

public class App {
    
    public static void main(String[] args) {

        // Objekt entsteht
        Cat cat = new Cat();

        //Wertzuweisung
        cat.setName("Alonzo");
        cat.setFurColor("grey");
        cat.setAge(35);
       
        // // output methode
        output(cat.tellField());

    }
// static output String
public static void output(String outputStr) {
    System.out.println(outputStr);
    }
    
// static output String[] // overload of output method
public static void output(String[] outputStr) {
    System.out.println(Arrays.toString(outputStr));
    }

// static output String[] // overload of output method
public static void output(Integer outputStr) {
    System.out.println(outputStr);
    }

}
