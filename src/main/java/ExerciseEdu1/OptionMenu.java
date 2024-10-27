package ExerciseEdu1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu  extends Account{
    Scanner MenuInput=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data= new HashMap<Integer,Integer>();
    /*Validate Login info  customer number and pin*/

    public  void getLogin() throws IOException{
        int x=1;
        do {
            try {
                data.put(012345,0123);
                data.put(123456, 1234);

                System.out.println("Welcome to the ATM Project");

                System.out.println("Enter the customer number");
                setCustomerNumber(MenuInput.nextInt());

                System.out.println("Enter the Pin number");
                setPinNumber(MenuInput.nextInt());


            }catch (Exception e){
                System.out.println("\n Invalid character(s). Only numbers. "+"\n");
                x=2;
            }
            for (Map.Entry<Integer, Integer> entry : data.entrySet()){
                if (entry.getKey() ==getCustomerNumber() && entry.getValue()==getPinNumber()){
                    getAccoutType();
                }
            }
            System.out.println("Wrong Account Number or Pin Number");

        }while (x==1);
    }

    /*display account type  Menu with selection */

    public void getAccoutType(){
        System.out.println("Select Account you want to access");
        System.out.println("Type 1: Checking account\nType 2: Savings Account\nType 3: Exit");
        System.out.println("Choice: ");

        int selection = MenuInput.nextInt();

        switch (selection){
            case 1:getChecking();
            break;

            case 2: getSaving();
            break;

            case 3:
                System.out.println("Thank you for using thsi ATM, Bye !");
                break;

            default:
                System.out.println(" Invalid Choice");
                getAccoutType();


        }
    }

    /*Displaying Checking account Menu with selection */
    public void getChecking(){
        System.out.println("Checking account");
        System.out.println("Type 1: View balance");
        System.out.println("Type 2: Withdraw Funds");
        System.out.println("Type 3; Deposit Funds");
        System.out.println("Choice: ");

        selection=MenuInput.nextInt();

        switch (selection){
            case 1:
                System.out.println("Checking Account Balance: "+ moneyFormat.format(getCheckingBalance()));
                getAccoutType();

            case 2:
                getCheckingWithdrawalInput();
                getAccoutType();
                break;

            case 3:
                getCheckingDepositInput();
                getAccoutType();
                break;

            case 4:
                System.out.println("Thank fro vist");
                break;

            default:
                System.out.println(" Invalid choice");
                getChecking();
        }
    }

    public void getSaving(){
        System.out.println("Saving account");
        System.out.println("Type 1: View balance");
        System.out.println("Type 2: Withdraw Funds");
        System.out.println("Type 3; Deposit Funds");
        System.out.println("Choice: ");

         selection=MenuInput.nextInt();

        switch (selection){
            case 1:
                System.out.println("Checking Account Balance: "+ moneyFormat.format(getSavingBalance()));
                getAccoutType();

            case 2:
                getSavingWithdrawalInput();
                getAccoutType();
                break;

            case 3:
                getSavingDepositInput();
                getAccoutType();
                break;

            case 4:
                System.out.println("Thank fro vist");
                break;

            default:
                System.out.println(" Invalid choice");
                getSaving();
        }
    }

    int selection;
}
