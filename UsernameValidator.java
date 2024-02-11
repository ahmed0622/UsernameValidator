/*
This class will contain a series of methods to take a string (username) and validate that it meets the following criteria

The following should have their own methods:
// username must be between 5 and 10 characters in length. ( length >= 5 and <=10)
// username must start with a letter like [a-z A-Z]
// username must end with a letter like [a-z A-Z]
// The first character and the last character of the username must NOT be the same.
// username must have at least one special character.  (tip: If a character is neither a letter nor a number, it is considered a special character).


// We'll use main() to have a Scanner that takes user input. And their answer will be passed to these methods.
// 3) If the rules are violated, the username and an error message should be displayed, and ask user to input new ID again.
// 4) When a valid username is provided, this username and appropriate message should be displayed, and your program stops.

If it works: "Welcome to the app"
IF not: "Invalid username"
 */
public class UsernameValidator {

    public static boolean inputIsValid(String username) {

        if(hasValidLength(username) &&
                isStartingWithLetter(username) &&
                isEndingWithLetter(username) &&
                hasDifferentFirstLastCharacter(username) &&
                hasSpecialCharacter(username)){
            return true;
        }

        return false;
    }

    // 1. Create a method that takes a string and returns a boolean that tells us if the string is between 5-10 characters.
    public static boolean hasValidLength(String username){
        return username.length() >= 5 && username.length() <= 10;
    }

    // 2. Create a method that takes a string and returns a boolean that tells us if the username starts with a letter [a-z A-Z]
    public static boolean isStartingWithLetter(String username){
        return Character.isLetter(username.charAt(0));
    }
    public static boolean isEndingWithLetter(String username) {
        return Character.isLetter(username.charAt(username.length() - 1));
    }

    public static boolean hasDifferentFirstLastCharacter(String username) {
        if (username.length() < 2){
            return false;
        }

        char firstChar = username.charAt(0);
        char lastChar = username.charAt(username.length() - 1);

        return firstChar != lastChar;
    }

    public static boolean hasSpecialCharacter(String username) {
        for (int i = 0; i < username.length(); i++) {
            char ch = username.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return true;
            }
        }
        return false;
    }
}


