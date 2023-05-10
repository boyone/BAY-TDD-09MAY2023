package tdd;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    private Map<Integer, String> romanNumberMapping = new HashMap<Integer, String>() {{
        put(1, "I");
        put(5, "V");
        put(10, "X");
        put(50, "L");
        put(100, "C");
        put(500, "D");
        put(1000, "M");
    }};
    public String covert(int input) {
        return romanNumberMapping.get(input);
    }
}
