public class ReverseWordLoop {
    public static void main(String[] args) {
        String input = "TEMPLE";
        char[] charArray = input.toCharArray();
        String reversedString = "";

        for (int i = charArray.length - 1; i >= 0; i--) {
            reversedString += charArray[i];
        }

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }
}
