package baseball.domain;

import baseball.exception.ErrorMessage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BaseballNumberTest {
    @Nested
    class SuccessTest {
        @DisplayName("유효한 숫자가 주어지면 정상적으로 BaseballNumber 객체를 생성한다")
        @Test
        void should_Return_BaseballNumber() {
            // when & then
            assertThat(new BaseballNumber(List.of(1,2,3))).isNotNull()
                    .isInstanceOf(BaseballNumber.class);
        }
    }

    @Nested
    class exceptionTest {
        @DisplayName("유효하지 않은 개수의 숫자가 주어지면 예외를 발생시킨다")
        @Test
        void should_ThrowException_ForInvalidNumber() {
            // when & then
            assertThatThrownBy(() -> new BaseballNumber(List.of(1,2,3,4)))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessageContaining(ErrorMessage.INVALID_NUMBER_SIZE.getMessage());
        }

        @DisplayName("유효하지 않은 범위의 숫자가 주어지면 예외를 발생시킨다")
        @Test
        void should_ThrowException_ForNumberOutOfRange() {
            // when & then
            assertThatThrownBy(() -> new BaseballNumber(List.of(0,1,2)))
                    .isInstanceOf(IllegalArgumentException.class)
                    .hasMessageContaining(ErrorMessage.NUMBER_OUT_OF_RANGE.getMessage());
        }
    }
}
