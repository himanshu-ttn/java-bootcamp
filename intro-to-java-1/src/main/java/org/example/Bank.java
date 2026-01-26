package org.example;
/* Ques: 6 :
* Implement a banking system using java. Create 3 sub class of Bank : SBI, BOI, ICICI

Classes should have attributes like Name, headofficeAddress, chairmanName, branchCount, fdInterestRate, personalLoanInterestRate, homeLoanInterestRate. All 3 should have following methods:

1. add getters and setters for the fields
2. print details of every bank (override toString)
*
* */
public class Bank {

    private double balance;

    public Bank(double b) {
        this.balance = b;
    }

    public Bank() {
    }

    public boolean addAmount(double amount){
        if(amount <= 0){
            System.out.println("Amount must be greater than 0.");
            return false;
        }

        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
        return true;
    }

    public boolean withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid amount! .");
            return false;
        }
        if (amount > balance){
            System.out.println("Insufficient amount! .");
            return false;
        }
        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
        return true;
    };

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
