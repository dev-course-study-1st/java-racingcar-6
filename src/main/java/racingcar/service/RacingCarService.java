package racingcar.service;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.utils.RandomNumberGenerator;
import racingcar.utils.constant.GameNumber;
import racingcar.view.OutputView;

import java.util.List;

public class RacingCarService {
    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    public void playGame(Cars cars, Integer tryCount) {
        for (int i = 0; i < tryCount; i++) {
            cars.moveAll(randomNumberGenerator, GameNumber.RANDOM_MIN.getNumber(), GameNumber.RANDOM_MAX.getNumber());
            OutputView.printCurrentPositions(cars);
        }
    }

    public void endGame(Cars cars) {
        List<Car> winners = cars.getWinners();
        OutputView.printWinners(winners);
    }
}
