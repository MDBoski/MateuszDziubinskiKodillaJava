package com.kodilla.good.patterns.allegro;

public class main {

    public static void main(String[] args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new BicycleOrderService(), new BicycleOrderRepository());
        productOrderProcessor.process(productOrderRequest);
    }
}

