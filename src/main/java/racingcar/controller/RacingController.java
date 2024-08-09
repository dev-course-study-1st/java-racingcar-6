package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Car;
import racingcar.service.RacingService;
import racingcar.util.constant.NumberEnum;
import racingcar.util.constant.StringEnum;
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

    private void run() throws IllegalArgumentException{
        String names = service.validateName(InputView.printInputName());
        List<Car> cars = service.createCars(names);
        int round = Integer.parseInt(InputView.printInputRound());

        play(cars, round);
    }

    private void play(List<Car> cars, int round) {
        for(int r = NumberEnum.ZERO.getNumber(); r < round; r++) {
            service.play(cars);
            OutputView.printMoveDistance(cars);
        }

        OutputView.printWinners(cars);
    }
}
