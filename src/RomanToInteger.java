public class RomanToInteger {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentVal = getValue(s.charAt(i));
            int nextVal = (i + 1 < s.length()) ? getValue(s.charAt(i + 1)) : 0;
            if (currentVal < nextVal) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }
        return result;
    }
    private int getValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();
        String romanNumber = "IX"; // Ваше римское число
        int result = converter.romanToInt(romanNumber);
        System.out.println("Integer representation: " + result);
    }
}
