import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

    public static String covert(int input) {

        Map<Integer, String> romanNumberMapping = new HashMap<>();
        romanNumberMapping.put(1, "I");
        romanNumberMapping.put(5, "V");
        romanNumberMapping.put(10, "X");
        romanNumberMapping.put(50, "L");
        romanNumberMapping.put(100, "C");
        romanNumberMapping.put(500, "D");
        romanNumberMapping.put(1000, "M");

        String output = "";

        // I, II, III
        if (input >= 1 && input <= 3) {
            for (int i = 0; i<input; i++){
                output += "I";
            }
        }

        // X, X, XXX
        if (input >= 10 && input <= 30) {
            for (int i = 0; i<input; i+=10){
                output += "X";
            }
        }

        // C, CC, CCC
        if (input >= 100 && input <= 300) {
            for (int i = 0; i<input; i+=100){
                output += "C";
            }
        }


        return output;
    }

    public static String getOutputBySwitchCase(int input) {
        String output = "";

        String additOutput = "";
        switch (input) {
            case 1:
                output = "I";
                break;
            case 2:
                output = "II";
                break;
            case 3:
                output = "III";
                break;
            case 10:
                additOutput += "X";
                output = String.join("", output, additOutput);
                if ((input / 10) != 1) {
                    covert(input);
                }
                break;
            default:
                output = "ERROR";
        }


        return output;
    }
}
