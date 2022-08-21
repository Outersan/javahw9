import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurrentFrequency() {
        Radio rad = new Radio();

        rad.setCurrentFrequency(4);

        int[] expected = 4;
        int[] actual = rad.getCurrentFrequency;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMax() {
        Radio rad = new Radio();

        rad.setCurrentFrequency(12);

        int expected = 9;
        int actual = rad.getCurrentFrequency;

        Assertions.assertEquals(expected, actual);
    }
}
