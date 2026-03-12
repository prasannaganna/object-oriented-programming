package com.java.st.oop.exceptions;

public class ExceptionTest {
    static void main(String[] args) {
        try {
            int result = 10 / 0;
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero!");
        }
        try{
            int[] arr = {1, 2, 3};
            System.out.println(arr[1]);
           //2 System.out.println(arr[-1]);

        }
        catch (ArrayIndexOutOfBoundsException| NegativeArraySizeException e)
        {
            System.out.println("error in array");
        }
        /*try
        {
            int[] arr = {1, 2, 3};
            System.out.println(arr[-1]); // Invalid negative index
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }*/
        System.out.println("Program continues...");
    }
}
