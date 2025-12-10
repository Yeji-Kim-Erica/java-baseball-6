package baseball.service;

import baseball.domain.Game;
import baseball.util.NumberGenerator;
import baseball.util.RandomNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BaseballServiceTest {
    @Nested
    class SuccessTest {
        @DisplayName("게임을 정상적으로 생성한다")
        @Test
        void should_Return_Game() {
            // given
            NumberGenerator numberGenerator = new RandomNumberGenerator();
            BaseballService service = new BaseballService(numberGenerator);

            // when & then
            assertThat(service.createGame()).isNotNull()
                    .isInstanceOf(Game.class);
        }
    }
}
