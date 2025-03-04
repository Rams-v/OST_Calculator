import java.util.*;

public class Input {
    // Scanner object for reading input
    private Scanner scanner = new Scanner(System.in);

    // Method to input two numbers
    public double[] inputNumbers() {
        double[] numbers = new double[2];

        // Prompt user to enter the first number
        System.out.print("Enter the first number: ");
        numbers[0] = scanner.nextDouble();

        // Prompt user to enter the second number
        System.out.print("Enter the second number: ");
        numbers[1] = scanner.nextDouble();

        return numbers;
    }

    // Method to input an array
    public double[] inputArray() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        double[] array = new double[size];

        // Prompt user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        return array;
    }
}
