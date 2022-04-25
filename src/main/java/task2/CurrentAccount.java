package task2;



class CurrentAccount {
    private static String name;
    private static String id;
    private double balance;
    private double overdraft; // overdraft facility granted
    private double overdrawn = 0; // overdrawn amount



    public CurrentAccount(String name, String id, double balance, double overdraft) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.overdraft = overdraft;
    }


    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }


    public boolean withdraw(double amt) {
        if (balance + overdraft >= amt) {
            if (amt < balance) balance -= amt;
            else {
                balance = 0;
                overdrawn += amt - balance;
            }
            return true;
        }
        return false;
    }
}
