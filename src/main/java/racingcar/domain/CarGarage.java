package racingcar.domain;

import java.util.List;

public class CarGarage {

    private final List<Car> cars;

    public CarGarage(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }
}
