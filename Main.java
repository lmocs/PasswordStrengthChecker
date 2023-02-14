/*

takes in string input from user
cannot contain a space
needs to be at least 8 chars long
one lowercase and one uppercase
one number
one special char

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        StrengthCheck entry = new StrengthCheck();

        System.out.println("Enter your password: ");
        String password = scnr.nextLine();

        entry.check(password);
    }
}