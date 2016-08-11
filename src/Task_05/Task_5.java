package Task_05;

import java.util.Scanner;

/**
 * Created by drkomp on 07.08.2016.
 */
public class Task_5 {
    double m, n;

    public void go() {
        Scanner input = new Scanner(System.in);
        System.out.println("This program looks for the nearest number to 10. To exit, type 0 twice.");
        do {
            System.out.print("Enter the first number : ");
            n = input.nextDouble();
            System.out.print("Enter the second number : ");
            m = input.nextDouble();
            if (Math.abs(n - 10) < Math.abs(m - 10)) System.out.println("the nearest number to 10 is: " + n);
            else if (Math.abs(n - 10) > Math.abs(m - 10)) System.out.println("the nearest number to 10 is: " + m);
            else System.out.println("both numbers are equidistant from the 10");
        } while (m != 0 && n != 0);
    }

    public static void main(String[] args) {
        Task_5 tsk = new Task_5();
        tsk.go();

    }
}
