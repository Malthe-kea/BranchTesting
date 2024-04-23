public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
    @Override
    public Boolean eat (String foodType) {
        return true;
    }
}
