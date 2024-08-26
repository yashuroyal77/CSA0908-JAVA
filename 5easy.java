import java.util.Scanner;

public class LCMAndGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N value = ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + " = ");
            numbers[i] = scanner.nextInt();
        }
        
        int gcdResult = numbers[0];
        int lcmResult = numbers[0];
        
        for (int i = 1; i < n; i++) {
            gcdResult = gcd(gcdResult, numbers[i]);
            lcmResult = lcm(lcmResult, numbers[i]);
        }
        
        System.out.println("LCM = " + lcmResult);
        System.out.println("GCD = " + gcdResult);
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }
}
