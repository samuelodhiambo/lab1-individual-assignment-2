package task2;



class SavingsAccount {
    private String name;
    private String id;
    private double balance;
    private double minAmount; // minimum amount to be maintained



    public SavingsAccount(String name, String id, double balance, double minAmount) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.minAmount = minAmount;
    }


    public double getBalance() {
        return balance;
    }


    public void deposit(double amt) {
        balance += amt;
    }



    public boolean withdraw(double amt) {
        if (balance - minAmount >= amt) {
            balance -= amt;
            return true;
        }
        return false;
    }


    /*
    public void setIdentification(String n, String i) {
        name = n;
        id = i;
    }*/
}
