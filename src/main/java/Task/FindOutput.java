package Task;

public class FindOutput {
    public static void main(String[] args) {

        int x=15;
        Example(x);
        System.out.println(x);
    }

    private static void Example(int x) {
        if (x==15){
             x=10;
            System.out.println(x);
        }
        System.out.println(x);
    }
}
