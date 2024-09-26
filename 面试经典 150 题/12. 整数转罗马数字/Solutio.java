
import javax.print.DocFlavor.STRING;

class Solution {

    public String intToRoman(int num) {
        StringBuffer sb = new StringBuffer();
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thousands = {"", "M", "MM", "MMM"};

        int one = num % 10,
                ten = (num % 100) / 10,
                hundred = (num % 1000) / 100,
                thousand = num / 1000;
        sb.append(thousands[thousand]);
        sb.append(hundreds[hundred]);
        sb.append(tens[ten]);
        sb.append(ones[one]);
        return sb;

    }
}
