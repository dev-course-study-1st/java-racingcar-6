package racingcar.controller;

import racingcar.model.Car;
import racingcar.service.RacingService;
import racingcar.util.constant.NumberEnum;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingController {

    private final RacingService service;

    public RacingController(RacingService racingService) {
        this.service = racingService;
    }

    public void start() {
        run();
    }

    private void run() throws IllegalArgumentException {
        String names = service.validateName(InputView.printInputName());
        List<Car> cars = service.createCars(names);
        String round = service.validateRound(InputView.printInputRound());
        playRaceGame(cars, Integer.parseInt(round));
    }

    private void playRaceGame(List<Car> cars, int round) {
        for(int r = NumberEnum.ZERO.getValue(); r < round; r++) {
            service.moveOrWait(cars);
            OutputView.printMoveDistance(cars);
        }

        OutputView.printWinners(cars);
    }
}
