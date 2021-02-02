import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;

public class calcTest {

    @Test
    @DisplayName("queNumeroEs")
    public void test1() {

        calc c = new calc();

        String result = c.appEstadistica(1);

        assertEquals(1, result);
    }

}
