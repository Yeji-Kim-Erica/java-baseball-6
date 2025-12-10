package baseball.view;

/**
 * 프로그램의 콘솔 출력을 담당하는 클래스
 */
public class ConsoleOutputView implements OutputView {
    private static final String GAME_START_INSTRUCTION = "숫자 야구 게임을 시작합니다.";

    @Override
    public void printGameStartInstruction() {
        System.out.println(GAME_START_INSTRUCTION);
    };
}
