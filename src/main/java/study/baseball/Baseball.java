package study.baseball;

import java.util.ArrayList;
import java.util.List;

public class Baseball {
    private List<Ball> balls;

    public Baseball(List<Integer> numbers) throws IllegalAccessException {
        mapToBalls(numbers);
        isThreeDigitNumber();
    }

    private void mapToBalls(List<Integer> numbers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            Ball ball = new Ball(i, numbers.get(i));
            balls.add(ball);
        }
        this.balls = balls;
    }

    boolean isThreeDigitNumber() throws IllegalAccessException {
        if (this.balls.size() != 3) {
            throw new IllegalAccessException("게임 숫자는 세 자리여야 합니다.");
        }
        return true;
    }
}
