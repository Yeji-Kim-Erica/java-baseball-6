package baseball.controller;

import baseball.domain.Game;
import baseball.service.BaseballService;
import baseball.view.InputView;
import baseball.view.OutputView;

/**
 * 프로그램의 전체 흐름을 조율하는 클래스
 */
public class GameController {
    private final InputView inputView;
    private final OutputView outputView;
    private final BaseballService service;

    public GameController(InputView inputView, OutputView outputView, BaseballService service) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.service = service;
    };

    public void run() {
        outputView.printGameStartInstruction();
        Game game = service.createGame();

        outputView.printNumberInputPrompt();
        String guessNumber = inputView.readGuessingNumber();
        service.match(guessNumber);
    }
}
