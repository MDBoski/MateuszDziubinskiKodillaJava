package com.kodilla.exception.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0};
        double averageExpected = 4.5;
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(averageExpected, average, 0.0001);
    }
}
