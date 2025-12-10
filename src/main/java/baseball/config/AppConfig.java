package baseball.config;

import baseball.controller.GameController;
import baseball.view.ConsoleOutputView;
import baseball.view.OutputView;

/**
 * 애플리케이션의 실행에 필요한 모든 객체를 생성하고 서로 연결하는 설정 클래스
 */
public class AppConfig {
    private static class LazyHolder {
        public static final AppConfig INSTANCE = new AppConfig();

        public static final OutputView OUTPUT_VIEW = new ConsoleOutputView();

        public static final GameController CONTROLLER = new GameController(OUTPUT_VIEW);
    }

    private AppConfig() {}

    public static AppConfig getInstance() {
        return LazyHolder.INSTANCE;
    }

    public GameController GameController() {
        return LazyHolder.CONTROLLER;
    }
}
