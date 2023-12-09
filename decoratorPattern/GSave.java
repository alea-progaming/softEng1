package decoratorPattern;

public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;
    private SavingsAccount account;

    public GSave(SavingsAccount account) {
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
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025;
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + ", GSave Transfer";
    }

    @Override
    public double computeBalanceWithInterest() {
        return account.getBalance() + (account.getBalance() * getInterestRate()); // shoul
    }
}
