package decoratorPattern;

public class UpSave implements BankAccountDecorator{
    private BankAccount bankAccount;
    private SavingsAccount account;

    public UpSave(SavingsAccount account) {
        this.account = account;
    }

    @Override
    public void setAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
    @Override
    public String showInfo() {
        return account.showInfo();
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + ", With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        return account.getBalance() + (account.getBalance() * getInterestRate()); // shoul
    }
}
