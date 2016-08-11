package Task_03;

import java.util.Scanner;

/**
 * Created by drkomp on 07.08.2016.
 */
public class Task_3 {
    int n;
    public void go(){
        Scanner input = new Scanner(System.in);
        System.out.println("For exit type 0");
        do {
            System.out.print("Enter a number: ");
            n = input.nextInt();
            if (n % 2 == 0) System.out.println("It is an even number");
            else System.out.println("It is an odd number");
        } while(n != 0);
    }
    public static void main(String[] args){
        Task_3 tsk = new Task_3();
        tsk.go();
    }
}
