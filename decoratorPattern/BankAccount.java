package decoratorPattern;

public interface BankAccount{
    public String showInfo();
    public String showAccountType();
    public double getInterestRate();
    public String showBenefits();
    public double computeBalanceWithInterest();
}
