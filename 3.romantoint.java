public class R192211406 {
    public static int romanToInt(String s) {
        int total = 0;
        int prevValue = 0;
        for (char c : s.toCharArray()) {
            int value = getValue(c);
            if (value > prevValue) {
                total += value - 2 * prevValue;
            } else {
                total += value;
            }
            prevValue = value;
        }
        return total;
    }

    private static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: throw new IllegalArgumentException("Invalid Roman numeral character");
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));    // Output: 3
        System.out.println(romanToInt("IV"));     // Output: 4
        System.out.println(romanToInt("IX"));     // Output: 9
        System.out.println(romanToInt("LVIII"));  // Output: 58
        System.out.println(romanToInt("MCMXCIV")); // Output: 1994
    }
}
