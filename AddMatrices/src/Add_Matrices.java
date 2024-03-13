import java.util.Scanner;

class MainClass {
    public static void main(String args[]) {
        // a class object is created
        Add_Matrices obj = new Add_Matrices();

        // the class object performs a sequence of actions
        long preTime, postTime;

        preTime = System.currentTimeMillis();
        obj.create();
        postTime = System.currentTimeMillis();
        System.out.println("Time taken for matrix creation: " + (postTime - preTime) + " milliseconds");

        preTime = System.currentTimeMillis();
        obj.display();
        postTime = System.currentTimeMillis();
        System.out.println("Time taken for matrix display: " + (postTime - preTime) + " milliseconds");

        preTime = System.currentTimeMillis();
        obj.add();
        postTime = System.currentTimeMillis();
        System.out.println("Time taken for matrix addition: " + (postTime - preTime) + " milliseconds");
    }
}

public class Add_Matrices {
    Scanner scan;
    int matrix1[][], matrix2[][], sum[][];
    int row, column;

    public Add_Matrices() {
        scan = new Scanner(System.in);
    }

    void create() {
        System.out.println("Matrix Addition");
        // the first matrix is created
        System.out.println("\nEnter number of rows & columns");
        row = Integer.parseInt(scan.nextLine());
        column = Integer.parseInt(scan.nextLine());
        matrix1 = new int[row][column];
        matrix2 = new int[row][column];
        sum = new int[row][column];
        System.out.println("Enter the data for the first matrix (each element separated by space):");
        for (int i = 0; i < row; i++) {
            String[] rowElements = scan.nextLine().split(" ");
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = Integer.parseInt(rowElements[j]);
            }
        }
        // the second matrix is created
        System.out.println("Enter the data for the second matrix (each element separated by space):");
        for (int i = 0; i < row; i++) {
            String[] rowElements = scan.nextLine().split(" ");
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = Integer.parseInt(rowElements[j]);
            }
        }
    }

    void display() {
        System.out.println("\nThe First Matrix is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\t" + matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n\nThe Second Matrix is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\t" + matrix2[i][j]);
            }
            System.out.println();
        }
    }

    void add() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("\n\nThe Sum is :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\t" + sum[i][j]);
            }
            System.out.println();
        }
    }
}