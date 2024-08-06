package racingcar.service;

import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.CarGarage;
import racingcar.util.generator.NumberGenerator;

public class RaceService {

    private final NumberGenerator numberGenerator;

    public RaceService(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public void race(CarGarage garage) {
        List<Car> cars = garage.getCars();
        for (Car car : cars) {
            int standard = numberGenerator.generate();
            car.moveOrStay(standard);
        }
    }

}
