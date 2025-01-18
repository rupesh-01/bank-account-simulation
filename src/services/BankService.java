package services;

import models.BankAccount;

public interface BankService {
    BankAccount addAccount(BankAccount bankAccount);
    String depositMoney(Integer accountNumber, double amount);
    String withdrawMoney(Integer accountNumber, double amount);
    String transferMoney(Integer to, Integer from, double amount);
}
