package Entities;

public class herancaBusinessAccount extends herancaAccount {
    private Double loanLimit;
    public herancaBusinessAccount(){
        super();
    }

    public herancaBusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void loan(double amount) {
        if (amount <= loanLimit){
            deposit(amount);
        }
    }
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }
}
