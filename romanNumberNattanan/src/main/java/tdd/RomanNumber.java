package tdd;

import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

    private Map<String, String> romanNumberalSymbol;

    public RomanNumber() {
        this.romanNumberalSymbol = new HashMap<>();
        this.romanNumberalSymbol.put("", "");
        this.romanNumberalSymbol.put("0", "");
        this.romanNumberalSymbol.put("00", "");
        this.romanNumberalSymbol.put("000", "");
        this.romanNumberalSymbol.put("0000", "");
        this.romanNumberalSymbol.put("1", "I");
        this.romanNumberalSymbol.put("2", "II");
        this.romanNumberalSymbol.put("3", "III");
        this.romanNumberalSymbol.put("4", "IV");
        this.romanNumberalSymbol.put("5", "V");
        this.romanNumberalSymbol.put("6", "VI");
        this.romanNumberalSymbol.put("7", "VII");
        this.romanNumberalSymbol.put("8", "VIII");
        this.romanNumberalSymbol.put("9", "IX");
        this.romanNumberalSymbol.put("10", "X");
        this.romanNumberalSymbol.put("20", "XX");
        this.romanNumberalSymbol.put("30", "XXX");
        this.romanNumberalSymbol.put("40", "XL");
        this.romanNumberalSymbol.put("50", "L");
        this.romanNumberalSymbol.put("60", "LX");
        this.romanNumberalSymbol.put("70", "LXX");
        this.romanNumberalSymbol.put("80", "LXXX");
        this.romanNumberalSymbol.put("90", "XC");
        this.romanNumberalSymbol.put("100", "C");
        this.romanNumberalSymbol.put("200", "CC");
        this.romanNumberalSymbol.put("300", "CCC");
        this.romanNumberalSymbol.put("400", "CD");
        this.romanNumberalSymbol.put("500", "D");
        this.romanNumberalSymbol.put("600", "DC");
        this.romanNumberalSymbol.put("700", "DCC");
        this.romanNumberalSymbol.put("800", "DCCC");
        this.romanNumberalSymbol.put("900", "CM");
        this.romanNumberalSymbol.put("1000", "M");
    }

    public String convertToRomanNumberFormat(int number) {
        StringBuilder romanNumber = new StringBuilder()
                .append(romanNumberalSymbol.get(number/1000 +"000"))
                .append(romanNumberalSymbol.get(number%1000/100 + "00"))
                .append(romanNumberalSymbol.get(number%100/10 + "0"))
                .append(romanNumberalSymbol.get(number%10 + ""));

        return romanNumber.toString();
    }
}
