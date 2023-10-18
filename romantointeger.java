import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "XIV"; // Replace with the Roman numeral you want to convert

        int result = romanToInt(romanNumeral);
        System.out.println("Integer equivalent: " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanValues.get(s.charAt(i));
            int nextVal = (i + 1 < s.length()) ? romanValues.get(s.charAt(i + 1)) : 0;

            if (currentVal < nextVal) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }
}