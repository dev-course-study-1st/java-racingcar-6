package racingcar.config;

import racingcar.controller.RacingController;
import racingcar.service.RacingService;
import racingcar.util.generate.RandomGenerator;
import racingcar.util.valid.NameValidator;
import racingcar.util.valid.RoundValidator;

public class AppConfig {

    private static RacingController controller;

    public static RacingController mainConfig() {
        if(controller == null) {
            controller = new RacingController(new RacingService(new RandomGenerator()));
        }
        return controller;
    }


}
