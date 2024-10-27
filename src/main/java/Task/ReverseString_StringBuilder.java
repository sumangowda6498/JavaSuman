package Task;

public class ReverseString_StringBuilder {
    public static void main(String[] args) {
        String str="Automation";
        StringBuilder reversed=new StringBuilder(str);
        reversed.reverse();
        System.out.println(reversed);

        String dev="Development";
        StringBuilder reve=new StringBuilder(dev).reverse();
        System.out.println(reve);
    }
}
