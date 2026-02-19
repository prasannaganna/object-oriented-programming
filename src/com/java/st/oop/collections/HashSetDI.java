package com.java.st.oop.collections;

import com.java.st.oop.arrays.DuplicateIntegers;

import java.util.HashSet;

public class HashSetDI {
    public  static  boolean DuplicateInteger(int[] numbs){
        HashSet<Integer>numbers= new HashSet<>();
        for(int numb : numbs){
            if(numbers.contains(numb)){
                System.out.println("duplicate value : " + numb);
               return  true;
            }
            numbers.add(numb);
        }
        return  false;
    }

    static void main(String[] args) {
        int[] numbs={1,2,3,4,1};
        System.out.println(DuplicateInteger(numbs));
      //  System.out.println("duplicate value is: " + numb);
       // System.out.println("duplicate valu is : " + DuplicateInteger(numbs));
    }
}
