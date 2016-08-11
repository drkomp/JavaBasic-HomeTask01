package Task_02;

public class Task_02 {
    public static void main(String[] args ){
        Dog dogOne = new Dog();
        Dog dogTwo = new Dog();
        dogOne.name = "spot";
        dogOne.says = "Ruff!";
        dogTwo.name = "scruffy";
        dogTwo.says = "Wurf!";
        System.out.println("first Dog name="+dogOne.name+"   says="+dogOne.says);
        System.out.println("second Dog  name="+dogTwo.name+"   says="+dogTwo.says);
// End now with constructor
        Dog dogThree = new Dog("spot 2","Ruff! 2");
        Dog dogFor = new Dog("scruffy 2","Wuff! 2");
        System.out.println("third Dog: name="+dogThree.name+"   says="+dogThree.says);
        System.out.println("fourth Dog: name="+dogFor.name+"   says="+dogFor.says);
    }
}
