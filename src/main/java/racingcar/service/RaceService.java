package racingcar.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import racingcar.domain.Car;
import racingcar.domain.CarGarage;
import racingcar.domain.RoundResult;
import racingcar.domain.Winner;
import racingcar.util.generator.NumberGenerator;

public class RaceService {

    private final NumberGenerator numberGenerator;

    public RaceService(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public RoundResult race(CarGarage garage) {
        List<Car> cars = garage.cars();
        for (Car car : cars) {
            int standard = numberGenerator.generate();
            car.moveOrStay(standard);
        }
        return toResult(cars);
    }

    private RoundResult toResult(List<Car> cars) {
        Map<String, Integer> result = new HashMap<>();
        for (Car car : cars) {
            result.put(car.getName(), car.getPosition());
        }
        return new RoundResult(result);
    }

    public Winner findWinner(CarGarage carGarage) {
        int maxPosition = carGarage.calculateMaxPosition();
        List<String> cars = carGarage.getCarsOnMaxPosition(maxPosition);
        return new Winner(cars);
    }
}
