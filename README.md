# Java Matrix Determinant Calculator

This Java project calculates the determinant of a 3x3 matrix. It prompts the user to enter the elements of the matrix, constructs the matrix, and then calculates the determinant using the rule of Sarrus.

## Matrix Determinant Calculation

The determinant of a 3x3 matrix is calculated using the rule of Sarrus, which involves multiplying certain elements of the matrix and summing them up in a specific pattern.

### Steps:

1. Create a 3x3 matrix by taking user input for each element.
2. Display the entered matrix.
3. Calculate the determinant using the rule of Sarrus.

## Usage

The `Main` class contains the `main` method, which serves as the entry point for the program. When executed, the program prompts the user to input the elements of the matrix, displays the entered matrix, and then calculates and prints the determinant.

### Example Usage:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        ArrayList<ArrayList<Integer>> Matrix = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Prompt user for matrix elements
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> column = new ArrayList<>();
            System.out.println("Column " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element [" + j + "][" + i + "]: ");
                int element = scanner.nextInt();
                column.add(element);
            }
            Matrix.add(column);
        }

        scanner.close();

        // Display the entered matrix
        System.out.println("Matrix:");
        for (ArrayList<Integer> column : Matrix) {
            for (int element : column) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Calculate and print the determinant
        int detValue = 0;
        for (int i = 0; i < 3; i++) {
            detValue += Matrix.get(0).get(i) * (Matrix.get(1).get((i + 1) % 3) * Matrix.get(2).get((i + 2) % 3) - Matrix.get(1).get((i + 2) % 3) * Matrix.get(2).get((i + 1) % 3));
        }

        System.out.println("Determinant: " + detValue);
    }
}
