package tdd;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

    private final Map<String, Integer> romanNumberMapping = new HashMap<String, Integer>() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);

    }};

    public Integer convertToNumber(String romanNumber) {

        if (romanNumber.length() == 1) {
            return romanNumberMapping.get(romanNumber);
        }

        return 0;
    }
}
