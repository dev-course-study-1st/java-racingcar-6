package racingcar.config;

import racingcar.controller.RacingController;
import racingcar.service.RacingService;
import racingcar.util.generate.RandomGenerator;
import racingcar.util.valid.NameValidator;

public class AppConfig {

    public static RacingController mainConfig() {
        return new RacingController(new RacingService(new NameValidator(), new RandomGenerator()));
    }
}
