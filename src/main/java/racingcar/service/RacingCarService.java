package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.utils.NumberGenerator;
import racingcar.utils.constant.GameNumber;
import racingcar.view.OutputView;

import java.util.List;
import java.util.Objects;

public class RacingCarService {
    private final NumberGenerator numberGenerator = new NumberGenerator();

    public void moveCars(Cars cars) {
        cars.moveAll(numberGenerator);
    }

    public void playGame(Cars cars, Integer tryCount) {
        for (int i = 0; i < tryCount; i++) {
            moveCars(cars);
            OutputView.printCurrentPositions(cars);
        }
    }

    public List<Car> calculateWinner(Cars cars) {
        return cars.getCars().stream()
                .filter(car -> Objects.equals(car.getPosition(), cars.getWinnerPosition()))
                .toList();
    }

    public void endGame(Cars cars) {
        List<Car> winners = calculateWinner(cars);
        OutputView.printWinners(winners);
    }
}
