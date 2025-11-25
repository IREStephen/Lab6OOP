public void withdraw(double amount) {
    if (amount <= 0) {
        throw new IllegalArgumentException("Withdraw amount must be positive");
    }
    if (amount > balance) {
        throw new IllegalArgumentException("Insufficient funds");
    }
    this.balance -= amount;
}
}
