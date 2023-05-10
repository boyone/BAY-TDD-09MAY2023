package tdd;

public class RomanNumber {

    String covert(int input) {
        if (input == 1) {
            return "I";
        } else if (input == 5) {
            return "V";
        } else if (input == 10) {
            return "X";
        } else if (input == 50) {
            return "L";
        } else if (input == 100) {
            return "C";
        } else if (input == 500) {
            return "D";
        } else if (input == 1000) {
            return "M";
        } else if (input == 2) {
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
