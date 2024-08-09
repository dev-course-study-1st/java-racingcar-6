package racingcar.controller;

import racingcar.model.Cars;
import racingcar.model.RoundStatus;
import racingcar.service.RaceService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RaceController {

    private final RaceService raceService;
    private final InputView inputView;
    private final OutputView outputView;

    public RaceController(RaceService raceService, InputView inputView, OutputView outputView) {
        this.raceService = raceService;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run(){
        Cars cars = inputView.getCarNames();
        int attemptCount = inputView.getAttemptCount();
        outputView.printRaceResult();
        for (int i = 0; i < attemptCount; i++) {
            RoundStatus roundStatus = raceService.race(cars);
            outputView.printRaceStatus(roundStatus);
        }
        outputView.printWinners(raceService.getWinners(cars));
    }
}
