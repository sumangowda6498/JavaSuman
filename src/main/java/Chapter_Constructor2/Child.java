package Chapter_Constructor2;
// from Rahul shetty selenium
public class Child extends Parent{
    String name="son";


    public static void main(String[] args) {
        Child child=new Child();
        child.getStringData();
    }

    public void getStringData(){
        System.out.println(name);
        System.out.println(super.name);
    }

}
