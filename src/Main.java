import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Step 1: Declare and populate the dataPoints array
        int[] dataPoints = new int[100];
        Random rnd = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1; // Random values between 1 and 100
        }

        // Step 2: Call the static getAverage method and display the result
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    // Step 3: Static method to calculate the average
    public static double getAverage(int values[]) {
        int sum = 0;

        for (int value : values) {
            sum += value; // Add each value to the sum
        }

        // Calculate and return the average
        return (double) sum / values.length;
    }
}



