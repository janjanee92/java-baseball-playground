package study.baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Baseball {
    private List<Ball> balls;

    public Baseball(List<Integer> numbers) throws IllegalAccessException {
        mapToBalls(numbers);
        isThreeDigitNumber();
        isDuplicate();
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
            throw new IllegalAccessException("숫자는 세 자리여야 합니다.");
        }
        return true;
    }

    public boolean isDuplicate() throws IllegalAccessException {
        Set<Integer> uniqueBallNos = balls.stream()
                .map(Ball::getNo)
                .collect(Collectors.toSet());

        if (uniqueBallNos.size() != balls.size()) {
           throw new IllegalAccessException("각 자리수는 중복일 수 없습니다.");
        }
        return false;
    }
}
