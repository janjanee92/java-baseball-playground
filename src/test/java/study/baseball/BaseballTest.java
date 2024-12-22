package study.baseball;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BaseballTest {

    @Test
    public void create() throws IllegalAccessException {
        Baseball baseball = new Baseball(List.of(1,2,3));
        assertNotNull(baseball);
    }

    @Test
    public void isThreeDigitNumber() throws IllegalAccessException {
        Baseball threeDigitBaseball = new Baseball(List.of(1,2,3));
        assertTrue(threeDigitBaseball.isThreeDigitNumber());

        assertThrows(IllegalAccessException.class, () -> {
            new Baseball(List.of(1, 2));
        });

        assertThrows(IllegalAccessException.class, () -> {
            new Baseball(List.of(1, 2, 3, 4));
        });
    }
}
