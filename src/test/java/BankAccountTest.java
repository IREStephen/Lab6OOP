@Test
public void testDepositIncreasesBalance() {
    BankAccount account = new BankAccount("123", "John Doe", 100.0);
    account.deposit(50.0);
    assertEquals(150.0, account.getBalance());
}

@Test
public void testDepositZeroOrNegativeThrowsException() {
    BankAccount account = new BankAccount("123", "John Doe", 100.0);
    assertThrows(IllegalArgumentException.class, () -> account.deposit(0));
    assertThrows(IllegalArgumentException.class, () -> account.deposit(-20));
}
}
