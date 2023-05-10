package tdd;

public class RomanNumber {
    public String convert(int num){
        String roman = "";
        for (int i = 1; i <= num ; i++) {
            roman += "I";
        }
        return roman;
    }
}
