package Chapter9_Inheritence;

public class Person {
private String name;
private int age;

public Person(){
    System.out.println("Default Person constriuctor");
}
public Person(String name){
    System.out.println("@nd Employee default constructor");
}
    private String gender;

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
