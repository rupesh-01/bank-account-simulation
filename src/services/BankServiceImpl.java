package services;

import models.BankAccount;
import repositories.BankAccountRepository;

public class BankServiceImpl implements BankService {
    private final BankAccountRepository bankAccountRepository;

    public BankServiceImpl(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    @Override
    public BankAccount addAccount(BankAccount bankAccount) {
        return null;
    }

    @Override
    public String depositMoney(Integer accountNumber, double amount) {
        //fetch the account
        //update the balance
        BankAccount account = bankAccountRepository.findByAccountNumber(accountNumber);
        if(account==null) throw new RuntimeException("No account found");
        account.setBalance(account.getBalance() + amount);
        return "Deposited successfully" + amount;
    }

    @Override
    public String withdrawMoney(Integer accountNumber, double amount) {
        BankAccount account = bankAccountRepository.findByAccountNumber(accountNumber);
        if(account==null) throw new RuntimeException("No account found");
        double availableBalance = account.getBalance();
        if(availableBalance < amount) throw new RuntimeException("Insufficient Balance");
        account.setBalance(account.getBalance() - amount);
        return "Withdrawal successfully " + amount;
    }

    @Override
    public String transferMoney(Integer to, Integer from, double amount) {
        BankAccount accountTo = bankAccountRepository.findByAccountNumber(to);
        if(accountTo ==null) throw new RuntimeException("No account found");
        BankAccount accountFrom = bankAccountRepository.findByAccountNumber(to);
        if(accountFrom ==null) throw new RuntimeException("No account found");
        if(accountFrom.getBalance() < amount) throw new RuntimeException("Insufficient Balance");
        accountFrom.setBalance(accountFrom.getBalance() - amount);
        accountTo.setBalance(accountTo.getBalance() + amount);
        return "Transferred successfully";
    }
}
