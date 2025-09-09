package FunctionalInterface;

import java.util.function.Predicate;

public class TempAlert {
    public static void main(String[] args) {
        Predicate<Double> highTemp = t -> t > 37.5;

        double currentTemp = 38.2;
        if (highTemp.test(currentTemp)) {
            System.out.println("ALERT: High temperature detected!");
        }
    }
}
