package tdd;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {
    private static Map<Integer, String> romanMapping = new HashMap(){{
        put(1,"I");
        put(4, "IV");
        put(5,"V");
        put(9, "IX");
        put(10, "X");
        put(50, "L");
        put(100, "C");
        put(500, "D");
        put(1000, "M");

    }};

    public String convert(int input) {
        return romanMapping.get(input);
    }
}
