package study.baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrikeTest {
    @Test
    void strike() {
        String number = "124";
        String input = "325";
        int count = 0;

        String[] numberSplit = number.split("");
        String[] inputSplit = input.split("");

        for (int i = 0; i < numberSplit.length; i++) {
            if (numberSplit[i].equals(inputSplit[i])) {
                count++;
            }
        }

        assertThat(count).isEqualTo(1);

    }
}
