
package Basic;

import java.util.Scanner;

public class StarProgramm {
    public static void main(String[] args) {
        StarProgramm program = new StarProgramm();
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Type two values of row and column : ");
            int row = s.nextInt();
            int column = s.nextInt();
            // program.triangle2( column);
            // program.triangle1( column);
           // program.squareFull(row, column);
            program.squareBorder(row, column);
        }
    }

    void squareFull(int row, int column) {
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void squareBorder(int row, int column) {
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                if (i == column - 1 || i == 0  || j == 0 || j == row-1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    void triangle1(int column) {
        for (int i = 0; i < column; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void triangle2(int column) {
        for (int i = 0; i < column; i++) {
            for (int j = column; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
