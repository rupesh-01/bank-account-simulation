package models;

public class BankAccount {
    private String accountHolderName;
    private Integer accountNumber;
    private double balance;
    private String mobileNumber;

    public BankAccount(String accountHolderName, double balance, String mobileNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.mobileNumber = mobileNumber;
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }
}
