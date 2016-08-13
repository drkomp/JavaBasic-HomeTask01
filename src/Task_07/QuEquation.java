package Task_07;

import java.util.Scanner;

/**
 * Created by drkomp on 11.08.2016.
 */
public class QuEquation {
    double a, b, c, d;

    public void go() {
        Scanner input = new Scanner(System.in);
        System.out.println("This program solve quadratic equation. ");
        System.out.println("The quadratic equation looks as ax^2+bx+c=0. To exit, type 0 three times.");
        System.out.println("Enter variable  ");
        do {
            System.out.print("Enter \"a\" : ");
            a = input.nextDouble();
            System.out.print("Enter \"b\" : ");
            b = input.nextDouble();
            System.out.print("Enter \"c\" : ");
            c = input.nextDouble();
            d = b*b-4*a*c;
            System.out.println("The Discriminant is: " + d);
            if (d < 0 ) System.out.println("This equation has no roots");
            else if (d > 0){
                System.out.println("This equation has two roots");
                System.out.println("x1="+((-b-Math.sqrt(d))/(2*a)));
                System.out.println("x2="+((-b+Math.sqrt(d))/(2*a)));
            }
            else {
                System.out.println("This equation has one root");
                System.out.println("x2="+((-b)/(2*a)));
            }
        } while (a != 0 && b != 0 && c != 0);
    }
    public static void main(String[] args) {
        QuEquation tsk = new QuEquation();
        tsk.go();

    }
}

