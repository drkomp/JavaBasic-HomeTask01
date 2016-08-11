package Task_06;

import java.util.Scanner;

/**
 * Created by drkomp on 08.08.2016.
 */
public class Triangle {
    double a, b;

    public void go() {
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculate area and hypotenuse of a right triangle. To exit, type 0 twice.");
        do {
            System.out.print("Enter the first cathetus (a) : ");
            a = input.nextDouble();
            System.out.print("Enter the second cathetus  : ");
            b = input.nextDouble();
            System.out.println("Triangle square is: " + (a*b/2));
            System.out.println("Triangle perimeter is: " + (a+b+Math.sqrt(a*a+b*b)));
        } while (a != 0 && b != 0);
    }

    public static void main(String[] args) {
        Triangle tsk = new Triangle();
        tsk.go();

    }
}
