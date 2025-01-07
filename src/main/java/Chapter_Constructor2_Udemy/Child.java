package Chapter_Constructor2_Udemy;
// from Rahul shetty selenium
public class Child extends Parent{
    String name="son";

    public Child(){// Constructor of Child class
        super();//calling Parent constructor
        System.out.printf(" Child constructor");
    }


    public static void main(String[] args) {
        Child child=new Child(); // when you instantiate object automtically constructors will be invoked
        child.getStringData();

        child.getData();
    }

    public void getStringData(){
        System.out.println(name);
        System.out.println(super.name);
    }

    public void getData(){

        System.out.println("I am in Child class");
        super.getData();//using super keyword we can call methods from super class
    }

}
