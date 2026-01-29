package com.tothenew.intro_to_java_1.ques6;

public class SBI extends Bank {
    private static final double MINIMUM_BALANCE = 1000;

    private String name;
    private String headOfficeAddress;
    private String chairman;
    private int branchCount;
    private double fdInterestRate;
    private double personalLoanInterestRate;
    private double homeLoanInterestRate;

    public SBI(String name, String headOfficeAddress, String chairman, int branchCount, double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate, double amount) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairman = chairman;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
        super(amount);
    }

    @Override
    public boolean withdraw(double amount) {
        if (getBalance() - amount < MINIMUM_BALANCE) {
            System.out.println("SBI require minimum balance of Rs. " + MINIMUM_BALANCE);
            return false;
        }
        super.withdraw(amount);
        return true;
    }

    @Override
    public String toString() {
        return "Bank Name: " + name +
                "\nHead Office: " + headOfficeAddress +
                "\nChairman: " + chairman +
                "\nBranch Count: " + branchCount +
                "\nFD Interest Rate: " + fdInterestRate + "%" +
                "\nPersonal Loan Interest Rate: " + personalLoanInterestRate + "%" +
                "\nHome Loan Interest Rate: " + homeLoanInterestRate + "%" +
                "\nCurrent Balance: ₹" + getBalance() +
                "\nMinimum Balance Required: ₹" + MINIMUM_BALANCE;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadOfficeAddress() {
        return headOfficeAddress;
    }

    public void setHeadOfficeAddress(String headOfficeAddress) {
        this.headOfficeAddress = headOfficeAddress;
    }

    public String getChairman() {
        return chairman;
    }

    public void setChairman(String chairman) {
        this.chairman = chairman;
    }

    public int getBranchCount() {
        return branchCount;
    }

    public void setBranchCount(int branchCount) {
        this.branchCount = branchCount;
    }

    public double getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(double fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }

    public double getPersonalLoanInterestRate() {
        return personalLoanInterestRate;
    }

    public void setPersonalLoanInterestRate(double personalLoanInterestRate) {
        this.personalLoanInterestRate = personalLoanInterestRate;
    }

    public double getHomeLoanInterestRate() {
        return homeLoanInterestRate;
    }

    public void setHomeLoanInterestRate(double homeLoanInterestRate) {
        this.homeLoanInterestRate = homeLoanInterestRate;
    }
}
