import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testConstructorStoresAccountNumber() {
        BankAccount account = new BankAccount("123", "John Doe", 100.0);
        assertEquals("123", account.getAccountNumber());
    }

    @Test
    public void testConstructorStoresOwnerNameAndBalance() {
        BankAccount account = new BankAccount("123", "John Doe", 100.0);
        assertEquals("John Doe", account.getOwnerName());
        assertEquals(100.0, account.getBalance());
    }
}
