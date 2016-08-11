package Task_04;

import java.util.Scanner;

/**
 * Created by drkomp on 07.08.2016.
 */
public class Task_4 {
    int n;
    int sumDigits;
    public void go(){
        Scanner input = new Scanner(System.in);
        System.out.println("For exit type 0");
        do {
            System.out.print("Enter a number for calculate the sum of digits (max 9 digits): ");
            sumDigits = 0;
            n = input.nextInt();
            while(n!=0){
                sumDigits+=n%10;
                n=n/10;
            }
            System.out.println("The sum of digits is: "+sumDigits);
        } while(sumDigits != 0);
    }
    public static void main(String[] args){
        Task_4 tsk = new Task_4();
        tsk.go();
    }
}
