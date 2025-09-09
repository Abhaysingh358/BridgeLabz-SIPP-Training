package Reflections;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "DEFAULT_KEY";

	public static String getAPI_KEY() {
		return API_KEY;
	}

	public static void setAPI_KEY(String aPI_KEY) {
		API_KEY = aPI_KEY;
	}
}

public class AccessAndModifyStaticFields {
    public static void main(String[] args) throws Exception {
        // Access private static field
        Field apiKeyField = Configuration.class.getDeclaredField("API_KEY");
        apiKeyField.setAccessible(true);

        // Modify value (null because it's static)
        apiKeyField.set(null, "NEW_SECRET_KEY");

        // Retrieve updated value
        String value = (String) apiKeyField.get(null);
        System.out.println("Updated API_KEY = " + value);
    }
}

