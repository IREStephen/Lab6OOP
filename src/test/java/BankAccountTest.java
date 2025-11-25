import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BankAccountTest {

    @Test
    public void testWithdrawReducesBalance() {
        BankAccount account = new BankAccount("123", "John Doe", 100.0);
        account.withdraw(40.0);
        assertEquals(60.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawZeroOrNegativeThrowsException() {
        BankAccount account = new BankAccount("123", "John Doe", 100.0);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(0));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-10));
    }

    @Test
    public void testWithdrawMoreThanBalanceThrowsException() {
        BankAccount account = new BankAccount("123", "John Doe", 100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200));
        assertEquals("Insufficient funds", exception.getMessage());
    }
}
