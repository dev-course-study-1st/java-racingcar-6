package racingcar;

import racingcar.controller.RaceController;
import racingcar.service.RaceService;
import racingcar.utils.converter.CarsConverter;
import racingcar.utils.generator.RandomNumberGenerator;
import racingcar.utils.validator.NameValidator;
import racingcar.utils.validator.NumberValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        RaceService raceService = new RaceService(new RandomNumberGenerator());
        InputView inputView = new InputView(new NameValidator(), new NumberValidator(), new CarsConverter());
        OutputView outputView = new OutputView();
        RaceController raceController = new RaceController(raceService, inputView, outputView);
        raceController.run();
    }
}
