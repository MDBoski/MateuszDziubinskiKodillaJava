package com.kodilla.patterns.singleton.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User millennials = new Millennials("Anna");
        User yGeneration = new YGeneration("John");
        User zGeneration = new ZGeneration("Nancy");

        //When
        String snapchat = millennials.sharePost();
        String twitter = yGeneration.sharePost();
        String facebook = zGeneration.sharePost();

        //Then
        Assert.assertEquals("Snapchat", snapchat);
        Assert.assertEquals("Twitter", twitter);
        Assert.assertEquals("Facebook", facebook);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User millennials = new Millennials("Anna");
        millennials.setSocialPublisher(new FacebookPublisher());

        //When
        String facebook = millennials.sharePost();

        //Then
        Assert.assertEquals("Facebook", facebook);
    }
}
