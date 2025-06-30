package Chapter11_C;

public class Execution {
    public static void main(String[] args) {
        HomeLoan loan=new HomeLoan();//Runtime Polymorphism
        double hloan =loan.claculateEmai(200000);
        System.out.println("Homeloan emi per year.."+hloan);
    }
}
