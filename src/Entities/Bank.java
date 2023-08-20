package Entities;

public class Bank {
    private int number;
    private String name;
    private double valueAcoount;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValueAcoount() {
        return valueAcoount;
    }

    public Bank(){}

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Bank(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }


    public double deposit(double amount){
        return valueAcoount = valueAcoount + amount;
    }

    public double withdraw(double amount) {
        return valueAcoount = valueAcoount -  amount - 5.00;
    }
    public String toString(){
        return "Account " + getNumber() + ", Holder: " + getName() + ", Balance: $ " + String.format("%.2f", getValueAcoount());
    }
}
