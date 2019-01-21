package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest(){
        //Given
        String log = "first login";
        String log2 = "secend login";
        //When
        Logger.getInstance().log(log);
        Logger.getInstance().log(log2);
        //Then
        Assert.assertEquals(log2, Logger.getInstance().getLastLog());
    }
}
