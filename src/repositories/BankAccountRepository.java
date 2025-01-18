package repositories;

import models.BankAccount;

public interface BankAccountRepository {
    BankAccount addAccount(BankAccount bankAccount);
    BankAccount findByAccountNumber(Integer accountNumber);
}
