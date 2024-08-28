package Chapter9_Inheritence;

public class Employee extends Person{
    public Employee(){
        super("suman");
        System.out.println("Default Employee Constructor");
    }
    private String employeeid;
    private String title;


    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
