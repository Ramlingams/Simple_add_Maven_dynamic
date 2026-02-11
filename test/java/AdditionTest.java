import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    void testAddition() {
        assertEquals(10, Addition.add(5,5));
    }
}
