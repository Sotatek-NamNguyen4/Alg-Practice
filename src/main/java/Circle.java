import java.util.Scanner;

public class Circle {
    static void drawCircle() {
        // Declare all the variables
        int diameter, xCoord, yCoord, rad, point;
        // Accept the radius from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius Of Solid Circle: ");
        rad = sc.nextInt();

        // Find the diameter of Circle
        diameter = 2 * rad;

        // Display a circle
        System.out.println("Solid Circle:");
        for (int row = 0; row <= diameter; row++) {
            for (int col = 0; col <= diameter; col++) {
                // Define both X-Coordinate and Y-Coordinate
                xCoord = rad - row;
                yCoord = rad - col;

                point = xCoord * xCoord + yCoord * yCoord;
                // Check whether point(xCoord, yCoord) is inside of circle or not
                if (point <= rad * rad + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // Print a new line
            System.out.println();
        }
    }
}
