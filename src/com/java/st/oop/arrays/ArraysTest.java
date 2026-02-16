package com.java.st.oop.arrays;

public class ArraysTest {
    static void main(String[] args) {
        int[] ids;
        ids = new int[4];
        System.out.println(ids[0]);
        ids[0] = 111;
        ids[1] = 222;
        ids[2] = 333;
        ids[3] = 444;
        System.out.println(ids[3]);
        int[] rollNo={1, 2, 3, 4};
        System.out.println(rollNo.length);
        System.out.println(rollNo[3]);
        System.out.println("arrays with for loop");
        for (int index = 0; index < rollNo.length; index++) {
            System.out.println(rollNo[index]);
        }
        for( int id:ids){
            System.out.println(id);
            char[] genders={'M','F'};
            for(char gender:genders)
            System.out.println(0);
        }
    }

}
