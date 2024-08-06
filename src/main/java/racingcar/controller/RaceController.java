package racingcar.controller;

import racingcar.domain.CarGarage;
import racingcar.domain.TryCount;
import racingcar.service.RaceService;
import racingcar.view.InputView;

public class RaceController {

    private final RaceService raceService;

    public RaceController(RaceService raceService) {
        this.raceService = raceService;
    }


    public void run() {
        CarGarage carGarage = InputView.inputCars();
        TryCount count = InputView.inputCount();
        for (int i = 0; i < count.value(); i++) {
            raceService.race(carGarage);
        }
    }

}
