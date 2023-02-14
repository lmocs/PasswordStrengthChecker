/*
 Criteria: 
 1. Takes in string input from user
 2. Cannot contain a space
 3. Needs to be at least 8 chars long
 4. One lowercase and one uppercase
 5. One number
 6. One special char
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        StrengthCheck entry = new StrengthCheck();

        // This prompts the user to enter a password to check
        System.out.println("Enter your password: ");
        String password = scnr.nextLine();

        // This executes the method from the StrengthCheck class
        entry.check(password);
    }
}
