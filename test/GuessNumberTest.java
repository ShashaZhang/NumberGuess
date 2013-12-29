import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

public class GuessNumberTest {
    @Test
    public void should_return_you_win_when_number_and_position_is_the_same() throws Exception {
        GuessNumber guessNumber = new GuessNumber("1");
        String output = guessNumber.guess("1");
        assertEquals("You Win",output);
    }

    @Test
    public void should_return_0A0B_when_number_is_not_right() throws Exception {
        GuessNumber guessNumber = new GuessNumber("2");
        String output = guessNumber.guess("1");
        assertEquals("0A0B",output);
    }

    @Test
    public void should_return_0A1B_when_only_one_number_is_right_but_on_the_wron_position() throws Exception {
        GuessNumber guessNumber = new GuessNumber("1234");
        String guess = guessNumber.guess("5671");
        assertEquals("0A1B", guess);
    }

    @Test
    public void should_return_1A0B_when_only_one_number_is_same() throws Exception {
        GuessNumber guessNumber = new GuessNumber("1234");
        String guess = guessNumber.guess("1678");
        assertEquals("1A0B", guess);
    }

    @Test
    public void should_return_2A2B() throws Exception {
        GuessNumber guessNumber = new GuessNumber("4567");
        String guess = guessNumber.guess("4765");
        assertEquals("2A2B",guess);
    }
}
