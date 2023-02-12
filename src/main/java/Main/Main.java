package Main;

import Model.Person;
import PersonService.PersonService;
import PersonService.PinValidation;

import java.util.Scanner;

public class Main {
    public static PersonService personService = new PersonService();
    public static PinValidation pinValidation = new PinValidation();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Alexandru");
        person.setLastname("Nicu");
        person.setPIN("1234");

        boolean inLoop = true;
        double currentBalance = 0;
        double newBalance = 0;


        if (pinValidation.pinCheck(sc, person.getPIN()) == false) {
            System.out.println("You ran out of attempts. Access Denied.");

        } else {
            while (inLoop) {
                System.out.println("WELCOME TO  BANK: " + person.getFirstName() + " " + person.getLastname());
                System.out.println("==================");
                personService.bankMenu();
                System.out.println("==================");
                System.out.println("Insert the number of action: ");
                int choice = sc.nextInt();


                switch (choice) {
                    case 1:
                        System.out.println("Your balance is: $" + personService.checkBalanceOrSavings(person.getBalance()));
                        System.out.println("====================");
                        break;
                    case 2:
                        System.out.println("You Savings Balance is: $" + personService.checkBalanceOrSavings(person.getSavings()));
                        System.out.println("====================");
                        break;
                    case 3:
                        System.out.println("Where you want to deposit the money: " + "\n" +
                                "1.Deposit in your balance." + "\n" + "2.In your Savings balance.");
                        int select1 = sc.nextInt();

                        if (select1 == 1) {
                            currentBalance = person.getBalance();
                            System.out.println("Enter the amount of money you want to deposit: ");
                            double money = sc.nextDouble();
                            newBalance = personService.deposit(currentBalance, money);
                            System.out.println("====================");
                            person.setBalance(newBalance);
                            System.out.println("Your balance it's now: " + newBalance);
                            System.out.println("====================");
                        } else if (select1 == 2) {
                            currentBalance = person.getSavings();
                            System.out.println("Enter the amount of money you want to deposit:");
                            double money = sc.nextDouble();
                            newBalance = personService.depositToSavings(currentBalance, money);
                            System.out.println("=====================");
                            person.setSavings(newBalance);
                            System.out.println("Your balance in Savings account is: " + newBalance);
                            System.out.println("====================");
                        } else {
                            System.out.println("Your action is invalid, Try Again !");
                        }
                        break;
                    case 4:
                        System.out.println("From witch account you want to make a withdraw: " + "\n" +
                                "1.From your deposit." + "\n" + "2.From your savings.");
                        int select2 = sc.nextInt();
                        if (select2 == 1) {
                            currentBalance = person.getBalance();
                            System.out.println("Enter the amount of money you want to withdraw: ");
                            double money = sc.nextDouble();
                            newBalance = personService.withdraw(currentBalance, money);
                            System.out.println("========================");
                            person.setBalance(newBalance);
                            System.out.println("Your balance is now: $" + newBalance);
                            System.out.println("====================");
                        } else if (select2 == 2) {
                            currentBalance = person.getSavings();
                            System.out.println("Enter the amount of money you want to withdraw: ");
                            double money = sc.nextDouble();
                            newBalance = personService.withdrawFromSavings(currentBalance, money);
                            System.out.println("=========================");
                            person.setSavings(newBalance);
                            System.out.println("Your balance is: $" + newBalance);
                            System.out.println("====================");
                        } else {
                            System.out.println("Your action is invalid, Try Again !");

                        }
                        break;
                    case 5:
                        inLoop = false;

                    default:
                        System.out.println("Not a valid option, TRY AGAIN !");
                }
            }
        }

    }
}
