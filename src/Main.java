import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> Matrix = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

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




        System.out.println("Matrix:");
        for (ArrayList<Integer> column : Matrix) {
            for (int element : column) {
                System.out.print(element + " ");
            }
            System.out.println();
        }




        int detValue = 0;

        for (int i = 0; i < 3; i++) {
            detValue += Matrix.get(0).get(i) * (Matrix.get(1).get((i + 1) % 3) * Matrix.get(2).get((i + 2) % 3) - Matrix.get(1).get((i + 2) % 3) * Matrix.get(2).get((i + 1) % 3));
        }

        System.out.println("Determinant: " + detValue);
    }
}
