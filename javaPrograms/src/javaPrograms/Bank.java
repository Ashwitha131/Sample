package javaPrograms;

class BankAccountAccount {
protected double balance;

public BankAccountAccount(double balance) {
   this.balance = balance;
}

public void withdraw(double amt) {
   balance -= amt;
}

public double getBalance() {
   return balance;
}
}

class CheckingAccount extends BankAccountAccount {
private double fee;

public CheckingAccount(double balance, double fee) {
   super(balance); // Call BankAccountAccountAccount constructor
   this.fee = fee;
}

@Override
public void withdraw(double amt) {
   balance -= (amt + fee);
}
}


public class Bank {
public static void main(String[] args) {
   CheckingAccount account = new CheckingAccount(1000.0, 10.0);
   account.withdraw(200.0);
   System.out.println("Balance after withdrawal: " + account.getBalance());
   
}
}

