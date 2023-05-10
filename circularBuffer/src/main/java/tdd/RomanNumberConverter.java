package tdd;

import java.util.Scanner;

public class RomanNumberConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        String romanNumber = convertToRoman(number);
        System.out.println("Roman number: " + romanNumber);
    }

    public static String convertToRoman(int number) {
        String[] romanSymbols = {
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        int[] romanValues = {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };

        StringBuilder romanNumber = new StringBuilder();
        int i = 0;

        while (number > 0) {
            if (number >= romanValues[i]) {
                romanNumber.append(romanSymbols[i]);
                number -= romanValues[i];
            } else {
                i++;
            }
        }

        return romanNumber.toString();
    }
}
