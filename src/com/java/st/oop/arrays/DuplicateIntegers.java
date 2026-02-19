package com.java.st.oop.arrays;
// finding the  duplicate integer  using the array

public  class DuplicateIntegers {
    public  static boolean DuplicateIntegers(int[] numbers) {
        for (int i= 0;i<numbers.length;i++){
            for (int j=i+1;j< numbers.length;j++){
                System.out.println("comparing: " +numbers[i] + " and " +numbers[j]);
                if (numbers[i]==numbers[j]){
                    System.out.println("duplicate found");
                    return true;
                }
            }
        }
        return  false ;
    }

    static void main(String[] args) {
        int[] number1={1,2,3,4,5};
        int[] number2 ={ 1,2,3,4,2,3};
        System.out.println(DuplicateIntegers(number1));
        System.out.println(DuplicateIntegers(number2));
    }
}
