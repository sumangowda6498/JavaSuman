package chapter1;

import java.time.LocalDate;
class Sample {
    public void display(){
        System.out.println("Display method in Person");
    }

    public static void main(String[] args){
        Sample person = new Sample();        //line 6
        person.display();                     //line 7
    }
}
