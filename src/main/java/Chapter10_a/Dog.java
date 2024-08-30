package Chapter10_a;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        //super.makeSound();
        System.out.println("Bow Bow");
    }

    public void fetch(){
        System.out.println("Dopg fetch for fun");
    }
}
