package Chapter10_a;

public class Zoo {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.makeSound();

        Dog dog=new Dog();
        dog.makeSound();
        dog.fetch();

        Animal ruby= new Dog();
        ruby.makeSound();
        feed(ruby);

        Cat cat=new Cat();
        cat.makeSound();

        ruby=new Cat();
        ruby.makeSound();
       // ( (Cat)ruby).scratch();
        feed(ruby);

    }

    private static void feed(Animal animal) {
        if(animal instanceof Dog){
            System.out.println("feed Padygree");
        }
        if (animal instanceof Cat){
            System.out.println("Feed Pizza");
        }

    }
}
