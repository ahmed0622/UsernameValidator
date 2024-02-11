import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    / We'll use main() to have a Scanner that takes user input. And their answer will be passed to these methods.
//// 3) If any of the rules are violated, the username and an error message should be displayed, and ask user to input new ID again.
//// 4) When a valid username is provided, this username and appropriate message should be displayed, and your program stops.
//
//    If it works: "Welcome to the app"
//    IF not: "Invalid username. Try again"
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = input.next();

        /*
         Check if the username has the right length, contains a special character, starts with a letter, ends with a letter, and first/last characters
         are not the same.

         If that's true, print "Welcome to the app"
         If that's false, print "Invalid username. Try again", and prompt the user again.
         */
        if(UsernameValidator.inputIsValid(username)){
            System.out.println("Welcome to the app");
        } else {

            // As long as the user enters an invalid input, repeat the prompt.
            while (!(UsernameValidator.inputIsValid(username))) {

                System.out.println("Invalid username. Try again");
                System.out.println("Enter your username");
                username = input.next();
            }
            System.out.println("Welcome to the app");
        }
    }
}