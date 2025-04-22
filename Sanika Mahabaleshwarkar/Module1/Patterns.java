import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of A : ");
        int height = input.nextInt();

        System.out.print("Enter the character : ");
        char symbol = input.next().charAt(0);

        int totalWidth = height * 2 - 1;
        int middleRow = (height % 2 == 0) ? height / 2 : (height / 2 + 1);

        for (int row = 0; row < height; row++) {
            int spaces = height - row - 1;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            System.out.print(symbol);
            if (row == middleRow) {
                int innerWidth = totalWidth - 2 * spaces - 2;
                for (int k = 0; k <= innerWidth; k++) {
                    System.out.print(k % 2 == 0 ? " " : symbol);
                }
            } else {
                int gap = totalWidth - 2 * spaces - 2;
                for (int k = 0; k < gap; k++) {
                    System.out.print(" ");
                }
                if (row != 0) {
                    System.out.print(symbol);
                }
            }

            System.out.println();
        }

        input.close();
    }
}