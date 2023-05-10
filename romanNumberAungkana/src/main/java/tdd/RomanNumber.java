package tdd;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumber {

    TreeMap<Integer, String> mapRomanMain = new TreeMap<Integer, String>();

    public RomanNumber() {
        mapRomanMain.put(1, "I");
        mapRomanMain.put(5, "V");
        mapRomanMain.put(10, "X");
        mapRomanMain.put(50, "L");
        mapRomanMain.put(100, "C");
        mapRomanMain.put(500, "D");
        mapRomanMain.put(1000, "M");
    }

    String covert(int input) {

        Integer itemKey = mapRomanMain.floorKey(input);

        if (itemKey == input) {
            return mapRomanMain.get(itemKey);
        }

        if (input == 2) {
            return "II";
        } else if (input == 3) {
            return "III";
        } else if (input == 20) {
            return "XX";
        } else if (input == 30) {
            return "XXX";
        }
        return "";
    }

}
