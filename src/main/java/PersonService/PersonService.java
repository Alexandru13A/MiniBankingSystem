package PersonService;

import Model.Person;

import java.util.List;

public class PersonService {

    public double checkBalanceOrSavings(double balance) {

        return balance;

    }

    public double deposit(double balance, double sumToDeposit) {
        double rest = 0;
        if (sumToDeposit <= 0) {
            System.out.println("The amount of money cannot be deposited");
        } else {
            rest = balance + sumToDeposit;
            System.out.println(rest);
        }
        return rest;
    }

    public double withdraw(double balance, double sumToWithdraw) {
        double rest = balance;
        if (balance < sumToWithdraw) {
            System.out.println("Your balance cannot be negative");
        } else {
            rest = balance - sumToWithdraw;
        }
        return rest;
    }

    public double depositToSavings(double savings, double sumToDeposit) {
        double rest = savings;
        if (sumToDeposit <= 0) {
            System.out.println("The amount of money cannot be deposited");
        } else {
            rest = savings + sumToDeposit;
            System.out.println(rest);
        }
        return rest;
    }

    public double withdrawFromSavings(double savings, double sumToWithdraw) {
        double rest = savings;
        if (savings < sumToWithdraw) {
            System.out.println("Your balance cannot be negative");
        } else {
            rest = savings - sumToWithdraw;
        }
        return rest;
    }


    public void bankMenu() {
        System.out.println("1.Check Your Balance");
        System.out.println("2.Check Tour Savings");
        System.out.println("3.Deposit");
        System.out.println("4.Withdraw");
        System.out.println("5.Exit");


    }


}
