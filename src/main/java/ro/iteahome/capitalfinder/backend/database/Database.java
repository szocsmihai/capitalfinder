package ro.iteahome.capitalfinder.backend.database;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private final Map<String, String> countries = new HashMap<>() {{
        put("Austria", "Vienna");
        put("Germany", "Berlin");
        put("Greece", "Athens");
        put("Hungary", "Budapest");
        put("Romania", "Bucharest");
    }};

    public String findCapital(String country) {
        // TODO: Return the capital of the country, or null if country is not in the database.
    }

}
