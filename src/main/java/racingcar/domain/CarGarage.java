package racingcar.domain;

import static racingcar.util.Const.START_POSITION;

import java.util.List;

public record CarGarage(List<Car> cars) {

    public int calculateMaxPosition() {
        return cars.stream()
                .map(Car::getPosition)
                .max(Integer::compare)
                .orElse(START_POSITION.getValue());
    }

    public List<String> getCarsOnMaxPosition(int maxPosition) {
        return cars.stream()
                .filter(it -> it.getPosition() == maxPosition)
                .map(Car::getName)
                .toList();
    }
}
