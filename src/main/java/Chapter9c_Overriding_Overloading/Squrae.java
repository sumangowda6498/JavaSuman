package Chapter9c_Overriding_Overloading;

public class Squrae extends Rectangle {

    @Override
    public double perimeter(){
        return length*width;
    }

    public void print(String what){
        System.out.println("print "+what);
    }
}
//overloading : Methods with same name with different parameter