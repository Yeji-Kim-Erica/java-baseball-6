package baseball.domain;

import baseball.exception.ErrorMessage;

import java.util.List;

/**
 * 숫자 야구 게임에 사용되는 숫자 도메인 클래스
 */
public class BaseballNumber {
    public static int NUMBER_SIZE = 3;
    public static int NUMBER_MIN = 1;
    public static int NUMBER_MAX = 9;

    private final List<Integer> numbers;

    public BaseballNumber(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        validateSize(numbers);
        validateRange(numbers);
    }

    private void validateSize(List<Integer> numbers) {
        if (numbers.size() != 3) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NUMBER_SIZE.getMessage());
        }
    }

    private void validateRange(List<Integer> numbers) {
        for (int number : numbers) {
            if (number < NUMBER_MIN || number > NUMBER_MAX) {
                throw new IllegalArgumentException(ErrorMessage.NUMBER_OUT_OF_RANGE.getMessage());
            }
        }
    }
}
