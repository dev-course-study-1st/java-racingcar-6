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

    public int calculateMaxPosition() {
        return cars.stream()
                .map(Car::getPosition)
                .max(Integer::compare)
                .orElse(0);
    }

    public List<String> getCarsOnMaxPosition(int maxPosition) {
        return cars.stream()
                .filter(it -> it.getPosition() == maxPosition)
                .map(Car::getName)
                .toList();
    }
}
