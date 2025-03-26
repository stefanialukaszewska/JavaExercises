package GenericsLambdasExercises.ListCreator;

import GenericsLambdasExercises.ListCreator.ListCreator;

import java.util.Arrays;
import java.util.List;

public class Main {

    // Let's provide list of flight destinations with prices in dollars.
    // We want to get flights from Warsaw and get prices in USD and PLN
    // The formula should look like this: 'flight to ___ - price: ___ USD / ___ PLN'

    static List<String> getFlights(List<String> list, double rate) {
        return ListCreator.getFrom(list)
                .when(
                        (String s) -> s.startsWith("WAW")
                )
                .mapEvery(
                        (String s) -> {
                            String[] temp = s.split(" ");
                            double pricePLN = rate * Integer.parseInt(temp[2]);
                            String PLN = String.valueOf(Math.round(pricePLN));
                            return "flight to " + temp[1] + " - price: " + temp[2] + " USD / " + PLN + " PLN";
                        }
                );

    }


    public static void main(String[] args) {
        List<String> destinations = Arrays.asList(
                "WAW JFK 1000",
                "WAW BLQ 200",
                "LAX WAW 2000",
                "WAW TYO 1500",
                "WRO KRK 100"
        );

        double rateUSD_PLN = 4.10;

        List<String> flights = getFlights(destinations, rateUSD_PLN);
        for (String s : flights) System.out.println(s);

    }

}

