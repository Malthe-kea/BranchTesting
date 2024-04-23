import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public Boolean eat (String foodType) {
        return true;
    }
}