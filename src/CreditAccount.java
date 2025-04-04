public class CreditAccount extends Account {
    private long creditLimit;

    public CreditAccount(String owner, long creditLimit) {
        super(owner);
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (amount > 0 && this.getBalance() + amount <= 0) {
            this.setBalance(this.getBalance() + amount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (amount > 0 && Math.abs(this.getBalance() - amount) <= this.creditLimit) {
            this.setBalance(this.getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }
}