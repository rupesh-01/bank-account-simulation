package repositories;

import models.BankAccount;

public class ArrayBankAccountRepository implements BankAccountRepository {
    BankAccount[] bankAccounts;
    int capacity;

    public ArrayBankAccountRepository(int capacity) {
        bankAccounts = new BankAccount[capacity];
        this.capacity = 0;
    }

    @Override
    public BankAccount addAccount(BankAccount bankAccount) {
        return null;
    }

    @Override
    public BankAccount findByAccountNumber(Integer accountNumber) {
        return null;
    }
}
