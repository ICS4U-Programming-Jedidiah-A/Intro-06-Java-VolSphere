import java.util.Scanner;
/**
* This program asks the user for the radius of a sphere.
* Then it calculates and displays the volume of the sphere.
*
* @author Jedidiah Alfred
* @version 1.0
* @since 2023-02-13
*/

public final class VolSphere {
    /**
    * This is a private constructor use to
    * satisfy the style checker.
    *
    * @exception IllegalStateException Utility Class.
    * @see IllegalStateException
    */
    private VolSphere() {
        throw new IllegalStateException("Utility Class");
    }
    public static void main(String[] args) {
       // Using Scanner for Getting Input from User
    final Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the radius of your sphere: ");

        // Get the radius as a string
        final String radius = scanner.nextLine();

       // Convert the radius to a double
       final double radiusDouble = Double.parseDouble(radius);

        if (radiusDouble < 0) {
            System.out.println("Radius can not be negative");
        } else {

        final double volume = 4.0 / 3.0 * Math.PI * Math.pow(radiusDouble, 3);

            System.out.print("The volume of the sphere with radius: ");
            System.out.print(radius + "cm, is ");
            System.out.format("%.2f .",volume);
        }
        // Closing Scanner
        scanner.close();
    }

}

