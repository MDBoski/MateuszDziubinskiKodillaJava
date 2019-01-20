package com.kodilla.exception.testing;

import com.kodilla.exception.testing.user.SimpleUser;
import com.kodilla.exception.testing.user.calculator.Calculator;


public class TestingMain<result1> {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania.");

        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("ERROR!");
        }

        System.out.println("Test - pierwszy test jednostkowy");

        Calculator calculator = new Calculator();

        if (Calculator.add(12, 28) == 12 + 28) {

            System.out.println("Test for add Calculator: ok");

        }else{

            System.out.println("Test for add Calculator: error!"); }

        if (Calculator.sub(12, 2) == 12 - 2) {

            System.out.println("Test for subtract Calculator: ok");

        }else{

            System.out.println("Test for subtract Calculator: error!"); }

    }

}















