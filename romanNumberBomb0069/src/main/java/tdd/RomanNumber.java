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

        int[] deviders = {100, 10, 1};

        for (int divider: deviders) {
            if (input >= (1 * divider) && input <= (3* divider)) {
                String returnString = "";
                for (int i = 0; i < input ; i += divider){
                    returnString += romanNumberMapping.get(divider);
                }
                return returnString;
            }
        }

        return romanNumberMapping.get(input);
    }
}
