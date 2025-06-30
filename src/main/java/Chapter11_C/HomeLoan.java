package Chapter11_C;

public class HomeLoan extends Loan{
    HomeLoan(){
        super(5,8.5f);
    }
    public double claculateEmai(double principle){
        double simpleIntrest=(principle*intrestRate*tenure)/100;
        double emi=(simpleIntrest+principle)/tenure;
        int tax=200;
        return emi+tax;
    }
}
