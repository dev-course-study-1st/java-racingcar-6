package racingcar.service;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.RoundStatus;
import racingcar.model.Winners;
import racingcar.utils.generator.NumberGenerator;

import java.util.ArrayList;
import java.util.HashMap;
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

    public Cars findWinners(Cars cars) {
        List<Car> carList = cars.getCarList();
        Car winner = cars.getCarList().get(0);
        for (Car car : carList) {
            if (car.isAheadOf(winner)) {
                winner = car;
            }
        }
        List<Car> winners = new ArrayList<>();
        for (Car car : carList) {
            if (car.isDrawWith(winner))
                winners.add(car);
        }
        return new Cars(winners);
    }

}
