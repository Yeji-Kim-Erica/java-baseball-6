package baseball.controller;

import baseball.view.OutputView;

/**
 * 프로그램의 전체 흐름을 조율하는 클래스
 */
public class GameController {
    private final OutputView outputView;

    public GameController(OutputView outputView) {
        this.outputView = outputView;
    };

    public void run() {
        outputView.printGameStartInstruction();
    }
}
