import java.util.Scanner;

public class SafeInput {
    public static int getRangedInt(String prompt, int low, int high) {
        Scanner in = new Scanner(System.in);
        int userValue;

        do {
            System.out.print(prompt);
            while (!in.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                in.next(); // Consume the invalid input
            }
            userValue = in.nextInt();

            if (userValue < low || userValue > high) {
                System.out.println("Input must be between " + low + " and " + high + ".");
            }
        } while (userValue < low || userValue > high);

        return userValue;
    }
}

