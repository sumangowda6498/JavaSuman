package Chapter10_a;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(" Cat Meow");
    }


    public void scratch(){
        System.out.println("I am cat ,Cat scratch");
    }

}
