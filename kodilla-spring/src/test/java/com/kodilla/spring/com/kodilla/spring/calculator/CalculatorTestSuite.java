package com.kodilla.spring.com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(5, 8);
        double subResult = calculator.sub(14, 5);
        double mulResult = calculator.mul(6, 10);
        double divResult = calculator.div(12, 4);

        //Then
        Assert.assertEquals(13, addResult, 0.01);
        Assert.assertEquals(9, subResult, 0.01);
        Assert.assertEquals(60, mulResult, 0.01);
        Assert.assertEquals(3, divResult, 0.01);
    }
}
