package Chapter9_Inheritence;
// by which one class inherits property or feature of other class its useses extends keyword.
//Encapsulation: wrping data in single unit called Encapsulation , we declare the variables as private and all methods for set and get values as public
public class Person {
private String name;
private int age;
private String gender;


public Person()
{
    System.out.println("Default Person constriuctor");
}

public Person(String name)
{
    System.out.println("@nd Employee default constructor");
}


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }



}
