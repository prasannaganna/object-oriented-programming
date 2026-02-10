package com.java.st.oop;

public class Person {
    int  height;    // variables wich are declear in the class instance variables
    int  weight;
    String name;
    Person(){
        //height =5;
        //weight = 56;
        //name = "prasanna";
    }
    Person(int height,int weight,String name){
        this.height = height ;
        this.weight = weight;
        this.name = name;
    }
    static void main(String[] args) {
        //System.out.println("test");
        int height; // variables in side the main function called local variables
        int weight = 100;
        Person person1 = new Person();
        Person person2 = new Person(5,65,"lakshmi");
        //person1.height;
        //System.out.println(person1.height);
        //System.out.println(person1.weight);
        System.out.println(person1.name);
        System.out.println(person2.weight);
        System.out.println(person2.height);
        System.out.println(person2.name);

    }
}
