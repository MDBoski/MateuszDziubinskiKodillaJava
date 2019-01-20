package com.kodilla.exception.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europa = new Continent("Europa");
        Continent asia = new Continent("Asia");
        Continent australia = new Continent("Australia");

        Country poland = new Country("Poland");
        Country germany = new Country("Germany");
        Country france = new Country("France");
        Country japan = new Country("Japan");
        Country china = new Country("China");
        Country australiaCountry = new Country("Australia");
        Country england = new Country("England");

        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(australia);

        europa.addCountry(poland);
        europa.addCountry(germany);
        europa.addCountry(france);
        europa.addCountry(england);

        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(england);

        australia.addCountry(australiaCountry);

        //When

        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("9000009");
        Assert.assertEquals(totalPeopleExpected, totalPeople);
    }
}
