package Chapter11_Abstraction;

public class Shapetester {
    public static void main(String[] args) {
Shape rectagle= new Rectangle(4,6);
Rectangle recct=new Rectangle(4,7);
        System.out.println(recct.getLength());
        System.out.println(recct.getWidth());

rectagle.print();

        System.out.println();
        System.out.println(rectagle.caluculatearea());
        System.out.println(recct.caluculatearea());

    }
}