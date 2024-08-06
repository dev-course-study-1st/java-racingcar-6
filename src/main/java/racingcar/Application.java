package racingcar;

import racingcar.controller.RaceController;

public class Application {
    public static void main(String[] args) {
        AppConfig config = new AppConfig();
        RaceController raceController = config.setSystem();
        raceController.run();
    }
}
