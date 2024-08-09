package racingcar.controller;

import static racingcar.view.InputView.*;
import static racingcar.view.OutputView.*;

import racingcar.domain.CarGarage;
import racingcar.domain.RoundResult;
import racingcar.domain.TryCount;
import racingcar.domain.Winner;
import racingcar.service.RaceService;

public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    public void run() {
        CarGarage carGarage = inputCars();
        TryCount count = inputCount();
        for (int i = 0; i < count.value(); i++) {
            RoundResult result = raceService.race(carGarage);
            printResult(result);
        }
        Winner winner = raceService.findWinner(carGarage);
        printWinner(winner);
    }

}
