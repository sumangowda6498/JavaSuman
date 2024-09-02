package chapter6_class;

public class HomeArea_InstantiatingObject {
    public static void main(String[] args) {


    //RECTANGLE 1//
    //create instantiating object of Rectangle class (ch6_classMathod.java)
    ch6_classMathod room1=new ch6_classMathod();
    room1.setWidth(25);
    room1.setLength(50);
    double areaRoom1= room1.calculateArea();

        //RECTANGLE 2//
        //create instantiating object of Rectangle class (ch6_classMathod.java)
     ch6_classMathod room2=new ch6_classMathod(30,60);
     double areaRoom2=room2.calculateArea();

     //add the area of both the room1 and room2
        double totalArea= areaRoom1+areaRoom2;
        System.out.printf("total area is "+totalArea);


}
}
