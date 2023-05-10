package tdd;

public class RomanNumber {
    public String covert(int input) {
        String roman = "";
        if(input/1000 >= 1) {
            roman = getDigit(input/1000, roman, "", "", "M",1000);
            input = input%1000;
        }
        if(input/100 >= 1) {
            roman = getDigit(input/100, roman, "M", "D", "C",100);
            input = input%100;
        }
        if(input/10 >= 1) {
            roman = getDigit(input/10, roman, "C", "L", "X",10);
            input = input%10;
        }
        roman = getDigit(input, roman,"X","V","I",1);

        return roman;
    }

    private static String getDigit(int input, String roman,String ten,String five,String one,int value) {
        switch(input){
            case 1 : roman = roman+one; break;
            case 2 : roman = roman+one+one;break;
            case 3 : roman = roman+one+one+one;break;
            case 4 : roman = roman+one+five;break;
            case 5 : roman = roman+five;break;
            case 6 : roman = roman+five+one;break;
            case 7 : roman = roman+five+one+one;break;
            case 8 : roman = roman+five+one+one+one;break;
            case 9 : roman = roman+one+ten;break;
        }
        return roman;
    }
}
