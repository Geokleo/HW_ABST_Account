public abstract class Account {
    private long balance;
    private String owner;

    public Account (String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public long getBalance() {
        return this.balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public abstract boolean add(long amount);
    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (amount > 0) {
            if(this.pay(amount)){
                if (account.add(amount)) {
                    return true;
                } else {
                    this.add(amount);
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}