package com.kodilla.exception.test;

public class Application {
    public static void main(String[] args) {
        Flight warLon = new Flight("WAR", "LON");
        Flight romNyc = new Flight("WAR", "NYC");
        Flight parWar = new Flight("PAR", "WAR");

        FlightSearcher flightSearcher = new FlightSearcher();

        try {
            boolean existWarLon = flightSearcher.findFlight(warLon);
            System.out.println("Flight Warsaw - London: " + existWarLon);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            boolean existWarNyc = flightSearcher.findFlight(romNyc);
            System.out.println("Flight Warsaw - New York City: " + existWarNyc);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

        try {
            boolean existParWar = flightSearcher.findFlight(parWar);
            System.out.println("Flight Paris - Warsaw: " + existParWar);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input correct airport name.");
        }

    }
}
