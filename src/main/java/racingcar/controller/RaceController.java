package racingcar.controller;

import racingcar.domain.CarGarage;
import racingcar.domain.RoundResult;
import racingcar.domain.TryCount;
import racingcar.domain.Winner;
import racingcar.service.RaceService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }

    public void run() {
        CarGarage carGarage = InputView.inputCars();
        TryCount count = InputView.inputCount();
        for (int i = 0; i < count.value(); i++) {
            RoundResult result = raceService.race(carGarage);
            OutputView.printResult(result);
        }
        Winner winner = raceService.findWinner(carGarage);
        OutputView.printWinner(winner);
    }

}
