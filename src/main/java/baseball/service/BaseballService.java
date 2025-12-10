package baseball.service;

import baseball.domain.Game;
import baseball.domain.BaseballNumber;
import baseball.util.NumberGenerator;

import java.util.List;

import static baseball.domain.BaseballNumber.NUMBER_SIZE;
import static baseball.domain.BaseballNumber.NUMBER_MIN;
import static baseball.domain.BaseballNumber.NUMBER_MAX;

/**
 * 숫자 야구 게임 비즈니스 로직을 담당하는 클래스
 */
public class BaseballService {
    private final NumberGenerator numberGenerator;

    public BaseballService(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public Game createGame() {
        List<Integer> numbers = numberGenerator.generateUniqueNumbersInRange(NUMBER_SIZE, NUMBER_MIN, NUMBER_MAX);
        BaseballNumber answer = new BaseballNumber(numbers);
        return new Game(answer);
    }

    public void match(String guessString) {
        BaseballNumber guessNumber = BaseballNumber.from(guessString);
    }
}
