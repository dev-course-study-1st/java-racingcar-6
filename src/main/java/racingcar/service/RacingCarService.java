package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.utils.constant.GameNumber;
import racingcar.view.OutputView;

import java.util.List;
import java.util.Objects;

public class RacingCarService {

    public boolean isMovable() {
        return Randoms.pickNumberInRange(GameNumber.RANDOM_MIN.getNumber(), GameNumber.RANDOM_MAX.getNumber()) >= GameNumber.IS_MOVABLE.getNumber();
    }

    public void moveCars(Cars cars) {
        cars.getCars().stream()
                .filter(car -> isMovable())
                .forEach(Car::moveForward);
    }

    public void playGame(Cars cars, int tryCount) {
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
