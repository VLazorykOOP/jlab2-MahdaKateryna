import java.text.NumberFormat;

public class Account {
    private String ownerName;
    private String accountNumber;
    private double interestRate;
    private double balance;

    public Account(String ownerName, String accountNumber, double interestRate, double initialBalance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.interestRate = interestRate;
        this.balance = initialBalance;
    }

    public void changeOwner(String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Знято " + amount + " грн з рахунку.");
        } else {
            System.out.println("Недостатньо коштів на рахунку.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Поповнено " + amount + " грн на рахунок.");
        } else {
            System.out.println("Сума для поповнення має бути більше нуля.");
        }
    }

    public void accrueInterest() {
        double interestAmount = balance * (interestRate / 100);
        balance += interestAmount;
        System.out.println("Нараховано відсотки: " + interestAmount + " грн.");
    }

    public String getBalanceInWords() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        return numberFormat.format(balance);
    }

    public void getAccountInfo() {
        System.out.println("\nВласник: " + ownerName);
        System.out.println("Номер рахунку: " + accountNumber);
        System.out.println("Відсоткова ставка: " + interestRate + "%");
        System.out.println("Баланс: " + getBalanceInWords() + " грн");
    }
}