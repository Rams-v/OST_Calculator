// Name: Ramitha V
// PRN: 22070126082
// Batch: AIML B1
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();  // Create an instance of the Input class
        Calculator calculator = new Calculator();  // Create an instance of the Calculator class

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            // Display the menu options
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Sum of Array");
            System.out.println("6. Mean of Array");
            System.out.println("7. Mode of Array");
            System.out.println("8. Median of Array");
            System.out.println("9. Variance of Array");
            System.out.println("10. Standard Deviation of Array");
            System.out.println("11. Exit");

            System.out.print("Enter your choice (1-11): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Input two numbers
                    double[] numbersAdd = input.inputNumbers();
                    System.out.println("Addition: " + calculator.addition(numbersAdd[0], numbersAdd[1]));
                    break;

                case 2:
                    // Input two numbers
                    double[] numbersSub = input.inputNumbers();
                    System.out.println("Subtraction: " + calculator.subtraction(numbersSub[0], numbersSub[1]));
                    break;

                case 3:
                    // Input two numbers
                    double[] numbersMul = input.inputNumbers();
                    System.out.println("Multiplication: " + calculator.multiplication(numbersMul[0], numbersMul[1]));
                    break;

                case 4:
                    // Input two numbers
                    double[] numbersDiv = input.inputNumbers();
                    if (numbersDiv[1] != 0) {
                        System.out.println("Division: " + calculator.division(numbersDiv[0], numbersDiv[1]));
                    } else {
                        System.out.println("Cannot perform division. The second number is zero.");
                    }
                    break;

                case 5:
                    // Input an array
                    double[] arraySum = input.inputArray();
                    System.out.println("Sum of Array: " + calculator.sumArray(arraySum));
                    break;

                case 6:
                    // Input an array
                    double[] arrayMean = input.inputArray();
                    System.out.println("Mean of Array: " + calculator.meanArray(arrayMean));
                    break;

                // Additional comments for new cases
                case 7:
                    // Input an array
                    double[] arrayMode = input.inputArray();
                    System.out.println("Mode of Array: " + calculator.modeArray(arrayMode));
                    break;

                case 8:
                    // Input an array
                    double[] arrayMedian = input.inputArray();
                    System.out.println("Median of Array: " + calculator.medianArray(arrayMedian));
                    break;

                case 9:
                    // Input an array
                    double[] arrayVariance = input.inputArray();
                    System.out.println("Variance of Array: " + calculator.varianceArray(arrayVariance));
                    break;

                case 10:
                    // Input an array
                    double[] arrayStd = input.inputArray();
                    System.out.println("Standard Deviation of Array: " + calculator.standardDeviationArray(arrayStd));
                    break;

                case 11:
                    // Handling the case when the user wants to exit the program
                    System.out.println("Exiting the program!");
                    break;

                default:
                    // Handling invalid choices
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 11);
    }
}
