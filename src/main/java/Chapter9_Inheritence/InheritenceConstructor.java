package Chapter9_Inheritence;

public class InheritenceConstructor {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setEmployeeid("71993jnsjj");
        employee.setTitle("The Employee");
        System.out.println(employee.getEmployeeid());
        System.out.println(employee.getTitle());


        Person person=new Person();
        Person person1=new Person();
        employee.setName("Suman");
        person.setName("Virat");
        person1.setName("Khkjk");
        System.out.println(employee.getName());
        System.out.println(person.getName());
        System.out.println(person1.getName());

        Mother mother=new Mother();
        mother.setName("India");
        mother.setAge(1000);
        System.out.println(mother.getName()+"is a "+mother.getGender()+" Age "+mother.getAge());

    }
}
