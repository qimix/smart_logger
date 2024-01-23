package Accounts;

public class Account {
    private int amount;

    boolean add(long amount) {
        if (amount > 0) {
            this.amount += amount;
            return true;
        } else {
            return false;
        }
    }

    boolean pay(long amount) {
        if (amount < 0 || this.amount >= amount) {
            this.amount -= amount;
            return true;
        } else {
            return false;
        }
    }

    boolean transfer(Account account, long amount) {
        if(pay(amount)) {
            account.add(amount);
        }
    }

    long getBalance() {
       return amount;
    }

}
