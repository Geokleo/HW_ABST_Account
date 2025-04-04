public class SimpleAccount extends Account {

    public SimpleAccount(String owner) {
        super(owner);
    }

    @Override
    public boolean add(long amount) {
        if (amount > 0) {
            this.setBalance(this.getBalance() + amount);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (amount > 0 && this.getBalance() >= amount) {
            this.setBalance(this.getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }
}