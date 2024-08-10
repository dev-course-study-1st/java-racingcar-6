package racingcar.controller;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Cars;
import racingcar.service.RacingCarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingCarController {
    private final RacingCarService racingCarService;

    public RacingCarController(RacingCarService racingCarService) {
        this.racingCarService = racingCarService;
    }

    public void run() {
        Cars cars = new Cars(InputView.racingCarNameInput());
        Integer tryCount = InputView.tryCountInput();
        OutputView.printRacingResultMsg();
        racingCarService.playGame(cars, tryCount);
        racingCarService.endGame(cars);
        Console.close();
    }

}
