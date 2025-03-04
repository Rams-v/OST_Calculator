import java.util.Arrays;

public class Calculator {

    // Method for addition of two numbers
    public double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    // Method for subtraction of two numbers
    public double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    // Method for multiplication of two numbers
    public double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    // Method for division of two numbers
    public double division(double firstNumber, double secondNumber) {
        if (secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            System.out.println("Cannot perform division. The second number is zero.");
            return Double.NaN;
        }
    }

    // Method to calculate the sum of an array
    public double sumArray(double[] array) {
        double sum = 0.0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    // Method to calculate the mean of an array
    public double meanArray(double[] array) {
        return sumArray(array) / array.length;
    }

    // Method to calculate the mode of an array
    public double modeArray(double[] array) {
        if (array.length == 0) {
            System.out.println("Cannot calculate mode for an empty array.");
        }

        double mode = array[0];
        int maxCount = 1;

        for (int i = 0; i < array.length; i++) {
            double currentElement = array[i];
            int currentCount = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == currentElement) {
                    currentCount++;
                }
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                mode = currentElement;
            }
        }

        if (maxCount <= 1) {
            System.out.println("No clear mode found in the array.");
        }

        return mode;
    }

    // Method to calculate the median of an array
    public double medianArray(double[] array) {
        if (array.length == 0) {
            System.out.println("Cannot calculate median for an empty array.");
        }

        // Sort the array
        Arrays.sort(array);

        int length = array.length;
        if (length % 2 == 0) {
            // If the array length is even, average the two middle elements
            int middleIndex1 = length / 2 - 1;
            int middleIndex2 = length / 2;
            return (array[middleIndex1] + array[middleIndex2]) / 2.0;
        } else {
            // If the array length is odd, return the middle element
            int middleIndex = length / 2;
            return array[middleIndex];
        }
    }

    // Method to calculate the variance of an array
    public double varianceArray(double[] array) {
        if (array.length == 0) {
            System.out.println("Cannot calculate variance for an empty array.");
        }

        double mean = meanArray(array);
        double sumSquaredDifferences = 0.0;

        for (double element : array) {
            double difference = element - mean;
            sumSquaredDifferences += difference * difference;
        }

        return sumSquaredDifferences / array.length;
    }

    // Method to calculate the standard deviation of an array
    public double standardDeviationArray(double[] array) {
        double variance = varianceArray(array);
        return Math.sqrt(variance);
    }
}
