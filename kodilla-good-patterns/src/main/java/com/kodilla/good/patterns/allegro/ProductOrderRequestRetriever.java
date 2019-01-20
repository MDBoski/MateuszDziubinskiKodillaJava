package com.kodilla.good.patterns.allegro;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {
        User user = new User("Jonathan", "Jon", "Wick");
        LocalDateTime orderDate = LocalDateTime.of(2019, 1, 10, 17, 49);
        Product product = new Bicycle("BMX",
                "The BMX bike is mainly used for evolution and for racing at very short distances using obstacles",
                new BigDecimal("1000"));
        int quantity = 1;

        System.out.println("Retrieve product request:");
        System.out.println("User: " + user.getUserName() +
                "\n" + "Date: "  + orderDate + "\n" +
                product + "\n"  +"quantity=" + quantity);
        return new ProductOrderRequest(user, orderDate, product, quantity);
    }
}

