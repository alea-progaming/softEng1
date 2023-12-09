package decoratorPattern;

public class SavingsAccount implements BankAccountDecorator{
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private int accountNumber;
    private String accountName;

    public double getBalance() {
        return balance;
    }

    private double balance;

    @Override
    public String showInfo() {
        return String.format("Account number: %d%nAccount name: %s%nBalance: %.1f",
                accountNumber, accountName, balance);
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return this.getBalance() + (this.getBalance() * getInterestRate());
    }

    @Override
    public void setAccount(BankAccount Account) {

    }
}
