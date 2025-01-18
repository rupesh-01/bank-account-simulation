package repositories;

import models.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapBankAccountRepository implements BankAccountRepository {
    private Map<Integer, BankAccount> bankAccountMap;

    public MapBankAccountRepository() {
        this.bankAccountMap = new HashMap<>();
    }


    @Override
    public BankAccount addAccount(BankAccount bankAccount) {
        Random random = new Random();
        Integer accountNumber = random.nextInt(4);
        bankAccount.setAccountNumber(accountNumber);
        bankAccountMap.put(accountNumber, bankAccount);
        return bankAccount;
    }

    @Override
    public BankAccount findByAccountNumber(Integer accountNumber) {
        if(bankAccountMap.containsKey(accountNumber)){
            return bankAccountMap.get(accountNumber);
        }
        return null;
    }
}
