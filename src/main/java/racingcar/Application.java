package racingcar;

import racingcar.config.AppConfig;
import racingcar.controller.RacingController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        RacingController controller = AppConfig.mainConfig();
        controller.start();
    }
}
