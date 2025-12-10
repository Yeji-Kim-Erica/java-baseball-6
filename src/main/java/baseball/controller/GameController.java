package baseball.controller;

import baseball.domain.Game;
import baseball.service.BaseballService;
import baseball.view.OutputView;

/**
 * 프로그램의 전체 흐름을 조율하는 클래스
 */
public class GameController {
    private final OutputView outputView;
    private final BaseballService service;

    public GameController(OutputView outputView, BaseballService service) {
        this.outputView = outputView;
        this.service = service;
    };

    public void run() {
        outputView.printGameStartInstruction();
        Game game = service.createGame();
    }
}
