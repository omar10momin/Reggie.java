import java.util.Scanner;

public class SafeInput {
    /**
     * Get a String input from the user that matches a specified regular expression pattern.
     *
     * @param pipe   a Scanner object opened to read from System.in
     * @param prompt prompt for the user
     * @param regEx  the regular expression pattern in Java String format to use for matching
     * @return a String input from the user that matches the specified regular expression pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String userInput;

        do {
            System.out.print(prompt + " ");
            userInput = pipe.nextLine();

            if (!userInput.matches(regEx)) {
                System.out.println("Invalid input. Please enter a valid input that matches the specified pattern.");
            }
        } while (!userInput.matches(regEx));

        return userInput;
    }
}
