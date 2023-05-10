package tdd;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class RomanNumber {

    private final Map<String, Integer> romanNumberMapping = new LinkedHashMap<String, Integer>() {{
        put("M", 1000);
        put("D", 500);
        put("C", 100);
        put("L", 50);
        put("X", 10);
        put("V", 5);
        put("I", 1);
    }};

    private final Map<String, String> romanNumberNextKeyMapping = new LinkedHashMap<String, String>() {{
//        put("M", "M");
        put("D", "M");
        put("C", "D");
        put("L", "C");
        put("X", "L");
        put("V", "X");
        put("I", "V");
    }};


    public Integer convertToNumber(String romanNumber) {

        if (romanNumber.length() == 1) {
            return romanNumberMapping.get(romanNumber);
        }

        return 0;
    }

    public String convertToRomanNumber(Integer number) {

        AtomicReference<Integer> tempNumber = new AtomicReference<>(number);
        StringBuilder romanBuilder = new StringBuilder();

        while (tempNumber.get() > 0) {
            for (Map.Entry<String, Integer> entry : romanNumberMapping.entrySet()) {
                if (tempNumber.get() <= 0) {
                    break;
                }
                if (tempNumber.get() >= entry.getValue()) {
                    tempNumber.set(tempNumber.get() - entry.getValue());
                    romanBuilder.append(entry.getKey());
                    break;
                }
            }
        }
        return toFormatRomanNumber(romanBuilder.toString());
    }

    public String toFormatRomanNumber(String plainCalculateRomanNumber) {

        StringBuilder newRomanStr = new StringBuilder();
        StringBuilder tempBuilder = new StringBuilder();
        int count = 0;
        int countSameLetter = 0;
        char currentChar = '-';
        char startChar = '-';
        for (char romanNum : plainCalculateRomanNumber.toCharArray()) {
            if (count == 0) {
                currentChar = romanNum;
                startChar = romanNum;
                tempBuilder.append(romanNum);
                count++;
            } else if (countSameLetter == 3) {
                if (currentChar == romanNum && romanNumberMapping.get(String.valueOf(startChar)) > romanNumberMapping.get(String.valueOf(romanNum))) {

                    tempBuilder.append(romanNum);

                    newRomanStr.append(currentChar + romanNumberNextKeyMapping.get(String.valueOf(startChar)));

                    tempBuilder = new StringBuilder();
                    count = 0;
                    countSameLetter = 0;

                } else if (currentChar == romanNum) {
                    count = 0;
                    countSameLetter = 0;

                    tempBuilder.append(romanNum);

                    String nextKey = romanNumberNextKeyMapping.get(String.valueOf(romanNum));
                    newRomanStr.append(romanNum + nextKey);

                    tempBuilder = new StringBuilder();
                } else {
                    count = 0;
                    countSameLetter = 0;
                    currentChar = '-';
                    startChar = '-';
                    newRomanStr.append(tempBuilder);
                    tempBuilder = new StringBuilder();

                }
            } else {
                if (currentChar == romanNum) {
                    tempBuilder.append(romanNum);
                    countSameLetter++;
                    count++;
                    currentChar = romanNum;
                } else if (romanNumberMapping.get(String.valueOf(startChar)) > romanNumberMapping.get(String.valueOf(romanNum))) {
                    tempBuilder.append(romanNum);
                    count++;
                    countSameLetter++;
                    currentChar = romanNum;
                } else {
                    count = 0;
                    countSameLetter = 0;
                    currentChar = '-';
                    startChar = '-';
                    tempBuilder.append(romanNum);
                    newRomanStr.append(tempBuilder);
                    tempBuilder = new StringBuilder();
                }
            }
        }

        if (countSameLetter == 3) {
            if (startChar == currentChar) {
                String nextKey = romanNumberNextKeyMapping.get(String.valueOf(currentChar));
                newRomanStr.append(currentChar + nextKey);
            } else {
                newRomanStr.append(romanNumberNextKeyMapping.get(String.valueOf(startChar)) + currentChar);
            }
        } else if (count != 0) {
            newRomanStr.append(tempBuilder);
        }
        return newRomanStr.toString();
    }
}


