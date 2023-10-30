import java.util.Scanner;

public class HW13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Веддіть кількість стобців : ");
        int rows = scanner.nextInt();
        System.out.print("Введіть кількість колонок : ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        int[][] transposedMatrix = new int[columns][rows];

        System.out.println("Введіть елементи матриці :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Оригінальна матриця :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Транспортована матриця:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
