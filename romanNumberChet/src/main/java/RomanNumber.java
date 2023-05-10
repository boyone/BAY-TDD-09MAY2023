public class RomanNumber {

    public String covert(int input) {
        String output = "";

        if (input == 1) {
            output = "I";
        }
        if (input == 2) {
            output = "II";
        }

        return output;
    }
}
