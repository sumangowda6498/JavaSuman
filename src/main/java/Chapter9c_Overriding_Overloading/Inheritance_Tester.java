package Chapter9c_Overriding_Overloading;

public class Inheritance_Tester {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        rectangle.print();

        Squrae square=new Squrae();
        square.print("SQUARE");

        calculatePerimeter();
    }

    public static void calculatePerimeter(){
        Rectangle rectangle=new Rectangle();
        rectangle.setLength(2);
        rectangle.setWidth(4);
        System.out.println(" Rectangle area "+rectangle.perimeter());

        Squrae square=new Squrae();
        square.setLength(2);
        square.setWidth(3);

        System.out.println(" Square area "+square.perimeter());

    }
}
