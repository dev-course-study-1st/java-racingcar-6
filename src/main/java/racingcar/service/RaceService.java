package racingcar.service;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.RoundStatus;
import racingcar.model.Winners;
import racingcar.utils.generator.NumberGenerator;
import java.util.List;

public class RaceService {
    private final NumberGenerator numberGenerator;

    public RaceService(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public RoundStatus race(Cars cars) {
        cars.moveCars(numberGenerator);
        return new RoundStatus(cars);
    }

    public Winners getWinners(Cars cars) {
        return new Winners(findWinners(cars));
    }

    private Cars findWinners(Cars cars) {
        Car winner = findWinner(cars);
        List<Car> winners = cars.getCarList()
                .stream()
                .filter(car -> car.isDrawWith(winner))
                .toList();
        return new Cars(winners);
    }

    private Car findWinner(Cars cars) {
        List<Car> carList = cars.getCarList();
        Car winner = carList.get(0);
        for (Car car : carList) {
            winner = car.getAheadOf(winner);
        }
        return winner;
    }

}
