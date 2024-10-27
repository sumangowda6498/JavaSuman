package ExerciseEdu1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input= new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");
    private int custmerNumber=012345;
    private int pinNumber=0123;

    private double checkingBalance=0;
    private double savingBalance=0;

    /*Set the Customer Number*/

    public int setCustomerNumber(int custmerNumber){
        this.custmerNumber= custmerNumber;
        
        return custmerNumber;
    }

    public int getCustomerNumber(){
        return custmerNumber;
    }

    public int setPinNumber(int pinNumber){
        this.pinNumber=pinNumber;
       return pinNumber;
    }

    public int getPinNumber(){
        return pinNumber;
    }
public double getCheckingBalance(){
        return checkingBalance;

}
    public double getSavingBalance(){
        return savingBalance;

    }

    /*Checking account withdrawal*/
    public double calcCheckingWithdrawal(double amount){
        checkingBalance=(checkingBalance-amount);
        return checkingBalance;

    }

    /*saving  account withdrawal*/
    public double calcSavingWithdrawal(double amount){
        savingBalance=(savingBalance-amount);
        return savingBalance;

    }

    /*Checking account deposit*/
    public double calcCheckingDeposit(double amount){
        checkingBalance=(checkingBalance+amount);
        return checkingBalance;

    }

    /*Saving account deposit*/
    public double calcSavingDeposit(double amount){
        savingBalance=(savingBalance+amount);
        return savingBalance;

    }

    /* Customer Checking Account Withdrawal input*/
public void getCheckingWithdrawalInput(){
    System.out.println("Checking Balance:"+moneyFormat.format(checkingBalance));
    System.out.println("Amount you want to withdraw");
    double amount= input.nextDouble();

    if ((checkingBalance-amount)>=0){
        calcCheckingWithdrawal(amount);
        System.out.println("New Checking Account balance: "+moneyFormat.format(checkingBalance));
    }
    else{
        System.out.println("Balance cannot be negative."+"\n");
    }
}

    /* Customer Saving Account Withdrawal input*/
    public void getSavingWithdrawalInput(){
        System.out.println("Saving Balance:"+moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw");
        double amount= input.nextDouble();

        if ((savingBalance-amount)>=0){
            calcSavingWithdrawal(amount);
            System.out.println("New Saving Account balance: "+moneyFormat.format(savingBalance));
        }
        else{
            System.out.println("Balance cannot be negative."+"\n");
        }
    }

    /* Customer Checking Account Deposite input*/
    public void getCheckingDepositInput(){
        System.out.println("Checking Balance:"+moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw");
        double amount= input.nextDouble();

        if ((checkingBalance+amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account balance: "+moneyFormat.format(checkingBalance));
        }
        else{
            System.out.println("Balance cannot be negative."+"\n");
        }
    }

    /* Customer Checking Account Deposite input*/
    public void getSavingDepositInput(){
        System.out.println("Checking Balance:"+moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw");
        double amount= input.nextDouble();

        if ((savingBalance+amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("New Saving Account balance: "+moneyFormat.format(savingBalance));
        }
        else{
            System.out.println("Balance cannot be negative."+"\n");
        }
    }



}
