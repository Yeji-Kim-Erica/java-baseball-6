package baseball.view;

/**
 * 프로그램의 모든 출력을 담당하는 인터페이스
 */
public interface OutputView {
    default void printGameStartInstruction() {};

    default void printNumberInputPrompt() {};
}