package tdd;

public class RomanNumber {

    String[] romanSymbols = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };
    int[] romanValues = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };

    public String convertRoman(int input) {
        String result = "";
        int i = 0;
        while (input > 0){
            if (input >= romanValues[i]) {
                result = result + romanSymbols[i];
                input -= romanValues[i];
            } else {
                i++;
            }
        }
        return result;
    }
}
