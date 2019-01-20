package com.kodilla.kodillacourse;

public class Calculator {

    int firstNumber = 10;

    int secendNumber = 20;

    int firstResult = firstNumber + secendNumber;
    int secendResult = firstNumber - secendNumber;

    public void someMethod() {

        System.out.println("Addition result:" + " " + firstResult + "\n" + "Subtraction result:" + secendResult);

        }

    public static void main(String args[]) {

        Calculator calculator = new Calculator();
        calculator.someMethod();

    }

}
