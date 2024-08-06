package racingcar.controller;

import racingcar.domain.CarGarage;
import racingcar.domain.TryCount;
import racingcar.view.InputView;

public class RaceController {

    public void run() {
        CarGarage carGarage = InputView.inputCars();
        TryCount count = InputView.inputCount();
    }

}
