package tdd;

public class RomanNumber {
    private static final String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] decimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public String covert(int num) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num > 0) {
            int k = num / decimal[i];
            for (int j = 0; j < k; j++) {
                sb.append(roman[i]);
                num -= decimal[i];
            }
            i++;
        }
        return sb.toString();
    }
}
