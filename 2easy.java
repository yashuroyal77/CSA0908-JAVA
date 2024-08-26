import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the user name: ");
        String username = scanner.nextLine();
        
        System.out.print("Reenter the user name: ");
        String reenteredUsername = scanner.nextLine();
        
        if (username.equals(reenteredUsername)) {
            System.out.println("User name is Valid");
        } else {
            System.out.println("User name is Invalid");
        }
        
        scanner.close();
    }
}
