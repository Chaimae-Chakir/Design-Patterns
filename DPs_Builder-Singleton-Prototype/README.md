# Design Patterns: Builder, Singleton, Prototype Patterns
## Introduction
In this activity, we will develop an object-oriented application for managing bank accounts. Each account is characterized by several attributes, including accountId, balance, currency, accountType, and accountStatus. The goal is to create a robust and flexible system that incorporates key object-oriented principles and design patterns.

## Work Overview:

1. Create the BankAccount class to represent individual bank accounts.
2. Design the AccountRepository interface, declaring operations for adding an account, consulting all accounts, retrieving an account by ID, and searching for an account based on a given predicate.
3. Implement the BankRepositoryImpl class, which serves as a concrete implementation of the AccountRepository interface. Store accounts in a HashMap.
4. Apply the Builder pattern to the BankAccount class to facilitate the creation of complex account objects.
5. Implement the Singleton pattern to ensure the existence of a single instance of BankRepositoryImpl.
6. Utilize the Prototype pattern in the BankAccount class to enable the cloning of account objects.
7. Explore and apply additional design patterns that may enhance the overall architecture and functionality of the banking application.

## BankAccount Class
### Description
BankAccount is a class that represents a bank account. It has the following attributes: 
- accountId of type String
- balance of type double
- currency : String
- accountType : AccountType (SAVING_ACCOUNT, CURRENT_ACCOUNT)
- accountStatus : AccountStatus (CREATED, ACTIVATED, BLOCKED, SUSPENDED)
- customer : Customer

```java
public class BankAccount implements Cloneable {
    private Long accountId;
    private double balance;
    private String currency;
    private AccountType type;
    private AccountStatus status;
    private Customer customer;
}
```
## Customer Class
```java
public class Customer {
    private Long id;
    private String name;
}
```

## AccountRepository Interface
```java
public interface AccountRepository {
    
   BankAccount save(BankAccount account);

   List<BankAccount> findAll();

   Optional<BankAccount> findById(Long id);

   List<BankAccount> searchAccounts(Predicate<BankAccount> predicate);

   BankAccount update(BankAccount account);

   void deleteById(Long id);
}
```

## AccountRepositoryImpl Class
```java
public class BankRepositoryImpl implements AccountRepository {
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
}
```

# Builder pattern 
## AccountBuilder Class
```java
public class AccountBuilder {
   private BankAccount bankAccount = new BankAccount();

   public AccountBuilder accountId(Long accountId) {
      bankAccount.accountId = accountId;
      return this;
   }

   public AccountBuilder balance(double balance) {
      bankAccount.balance = balance;
      return this;
   }

   public AccountBuilder currency(String currency) {
      bankAccount.currency = currency;
      return this;
   }

   public AccountBuilder type(AccountType type) {
      bankAccount.type = type;
      return this;
   }

   public AccountBuilder status(AccountStatus status) {
      if (bankAccount.getType().equals(AccountType.CURRENT_ACCOUNT))
         bankAccount.status = status;
      else bankAccount.status = AccountStatus.ACTIVATED;
      return this;
   }

   public BankAccount build() {
      return this.bankAccount;
   }
}
```
## BankDirector Class
```java
public class BankDirector {
    public static BankAccount.AccountBuilder accountBuilder() {
        return new BankAccount.AccountBuilder();
    }
}
```
# Singleton pattern
## BankRepositoryImpl Class
```java
public class AccountRepositoryImpl implements AccountRepository { 
    
    private static final AccountRepositoryImpl accountRepository;
    
    static {
      System.out.println("Singleton instantiation");
      accountRepository = new AccountRepositoryImpl();
    }

   public synchronized static AccountRepositoryImpl getInstance() {
      return accountRepository;
   }
}
```

# Prototype pattern
## BankAccount Class
```java
public class BankAccount implements Cloneable {
    private Long accountId;
    private double balance;
    private String currency;
    private AccountType type;
    private AccountStatus status;
    private Customer customer;

    @Override
    public BankAccount clone() throws CloneNotSupportedException {
        BankAccount account = (BankAccount) super.clone();
        account.customer = (Customer) customer.clone();
        return account;
    }
}
```
## Customer Class
```java
public class Customer implements Cloneable {
    private Long id;
    private String name;

    @Override
    public Customer clone() throws CloneNotSupportedException {
        return (Customer) super.clone();
    }
}
```

## Conclusion

This activity implements object-oriented programming concepts and utilizes various design patterns such as Builder, Singleton, and Prototype to create a Java application for managing bank accounts. These patterns enhance flexibility, maintainability, and code reusability.



    
