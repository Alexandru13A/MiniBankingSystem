package Model;

import java.util.List;

public class Person {

    private String firstName;
    private String lastname;
    private String PIN;
    private double balance;
    private double savings;

    public Person() {

    }

    public Person(String firstName, String lastname, String PIN, double balance, double savings) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.PIN = PIN;
        this.balance = balance;
        this.savings = savings;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPIN() {
        return PIN;
    }

    public void setPIN(String PIN) {
        this.PIN = PIN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", PIN='" + PIN + '\'' +
                ", balance=" + balance +
                '}';
    }
}
