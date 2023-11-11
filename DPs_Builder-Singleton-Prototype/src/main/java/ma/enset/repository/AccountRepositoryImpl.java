package ma.enset.repository;


import ma.enset.enums.AccountStatus;
import ma.enset.enums.AccountType;
import ma.enset.models.BankAccount;
import ma.enset.models.BankDirector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

public class AccountRepositoryImpl implements AccountRepository {

    private static final AccountRepositoryImpl accountRepository;

    static {
        System.out.println("instantiation du singleton");
        accountRepository = new AccountRepositoryImpl();
    }

    private AccountRepositoryImpl() {
    }

    private Map<Long, BankAccount> accounts = new HashMap<>();
    private long accountCounter = 0;

    @Override
    public BankAccount save(BankAccount account) {
        Long accountId;

        synchronized (this) {
            accountId = ++accountCounter;
        }
        account.setAccountId(accountId);

        synchronized (this) {
            accounts.put(accountId, account);
        }
        return account;
    }

    @Override
    public List<BankAccount> findAll() {
        return accounts.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        BankAccount account = accounts.get(id);
        if (account == null)
            return Optional.empty();
        else
            return Optional.of(account);
    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {
        return accounts.values().stream().filter(predicate).toList();
    }

    @Override
    public BankAccount update(BankAccount account) {
        accounts.put(account.getAccountId(), account);
        return account;
    }

    @Override
    public void deleteById(Long id) {
        accounts.remove(id);
    }

    public void populateData() {
        for (int i = 0; i < 10; i++) {
            BankAccount account = BankDirector.accountBuilder()
                    .balance(1000 + Math.random() * 1000)
                    .currency("USD")
                    .type(Math.random() > 0.5 ? AccountType.SAVINGS_ACCOUNT : AccountType.CURRENT_ACCOUNT)
                    .status(Math.random() > 0.5 ? AccountStatus.CREATED : AccountStatus.ACTIVATED)
                    .currency(Math.random() > 0.5 ? "USD" : "EUR")
                    .build();

            save(account);
        }
        System.out.println("----------------------------------");
        System.out.println(Thread.currentThread().getName());
        System.out.println("count: " + accountCounter);
        System.out.println("size: " + accounts.values().size());
        System.out.println("----------------------------------");
    }

    public synchronized static AccountRepositoryImpl getInstance() {
        return accountRepository;
    }

}
