package Task08;

import java.util.Scanner;

/**
 * Created by drkomp on 13.08.2016.
 */
public class Human {
    private int hummanOptions;
    //each octet in this variable contains data in the following order:
    // age, weight, height, birthday year

    public void setAge(int age){
        if(age > 255 || age < 0) throw new IllegalArgumentException("Age is too big or negative");
        hummanOptions = (hummanOptions & 0x00ffffff) | (age<<24);
    }
    public int getAge(){
        return ( hummanOptions >>> 24);
    }
    public void setWeight(int weight){
        if(weight > 255 || weight < 0) throw new IllegalArgumentException("Weight is too big or negative");
        hummanOptions = (hummanOptions & 0xff00ffff) | (weight<<16);}
    public int getWeight(){ return 0x000000ff & (hummanOptions >>> 16); }
    public void setHeight(int height){
        if(height > 255 || height < 0) throw new IllegalArgumentException("Height is too big or negative");
        hummanOptions = (hummanOptions & 0xffff00ff) | (height<<8);
    }
    public int getHeight(){
        return 0x000000ff & (hummanOptions >>> 8);
    }
    public void setBirthYear(int bYear){
        //work with years from 1900 to 2155
        if(bYear > 2155 || bYear < 1900) throw new IllegalArgumentException("Birthday year is too big or too small for this program.");
        hummanOptions = (hummanOptions & 0xffffff00) | (bYear - 1900);
    }
    public int getBirthYear(){
        return 1900 + (hummanOptions & 0x000000ff);
    }
    public static void main(String[] args) {

        int tempInput = 0;
        Scanner input = new Scanner(System.in);
        Human expHuman = new Human();
        System.out.println("This program saved four parameters to one integer variable in object Humam. Try it!");
        do {
            System.out.print("Enter a human age (to exit type \"-1\"): ");
            tempInput = input.nextInt();
            if (tempInput == -1) break;
            expHuman.setAge(tempInput);
            System.out.print("Enter a human weight: ");
            expHuman.setWeight(input.nextInt());
            System.out.print("Enter a human height: ");
            expHuman.setHeight(input.nextInt());
            System.out.print("Enter a human birthday year: ");
            expHuman.setBirthYear(input.nextInt());
            System.out.println("Let's see what we've got. Get the parameters of the object Human");
            System.out.println("Human's age: " + expHuman.getAge());
            System.out.println("Human's weight: " + expHuman.getWeight());
            System.out.println("Human's height: " + expHuman.getHeight());
            System.out.println("Human's birthday year: " + expHuman.getBirthYear());
            System.out.println();
            System.out.println("And try again!");

        } while (true);
    }
}
