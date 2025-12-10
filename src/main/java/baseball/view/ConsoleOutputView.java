package baseball.view;

/**
 * 프로그램의 콘솔 출력을 담당하는 클래스
 */
public class ConsoleOutputView implements OutputView {
    @Override
    public void printGameStartInstruction() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    };

    @Override
    public void printNumberInputPrompt() {
        System.out.print("숫자를 입력해주세요 : ");
    }
}
