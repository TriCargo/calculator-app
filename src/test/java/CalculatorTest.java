import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals(2 + 3, 5);
    }

    @Test
    public void testSubtraction() {
        assertEquals(5 - 3, 2);
    }
}
