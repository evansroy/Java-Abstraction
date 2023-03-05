//Abstract class
abstract class Animal{
    //Abstract method (does not hava a body)
    public abstract void animalSound();
    //Regular Method
    public void sleep(){
        System.out.println("Zzzz");
    }
}

//Subclass (inherit from animal)
class Pig extends Animal {
    public void animalSound(){
        //The body of animalSound() is provided here
        System.out.println("The pig says: Wee wee");
    }
}
public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();// create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}