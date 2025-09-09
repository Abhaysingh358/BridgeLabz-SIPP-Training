package LambdaExpression;

import java.util.HashMap;
import java.util.Map;

public class SmartHome {
    public static void main(String[] args) {
        // Define behaviors using lambdas
        Map<String, Runnable> triggers = new HashMap<>();

        triggers.put("motion", () -> System.out.println("Lights ON - Motion detected!"));
        triggers.put("time", () -> System.out.println("Lights ON - Evening mode activated!"));
        triggers.put("voice", () -> System.out.println("Lights ON - Voice command accepted!"));

        // Simulate triggers
        triggers.get("motion").run();
        triggers.get("time").run();
        triggers.get("voice").run();
    }
}
