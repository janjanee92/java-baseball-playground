package study.baseball;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BallTest {

    @ParameterizedTest
    @CsvSource({
            "1, true",
            "9, true",
            "0, false",
            "10, false"
    })
    public void isBetweenOneAndNine(int no, boolean expected) {
        Ball ballNo = new Ball(1, no);
        assertEquals(ballNo.isBetweenOneAndNine(), expected);
    }
}
