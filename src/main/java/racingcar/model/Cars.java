package racingcar.model;

import racingcar.utils.NumberGenerator;
import racingcar.utils.validator.InputValidator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(String[] carsInput) {
        this.cars = generateCars(carsInput);
    }

    private List<Car> generateCars(String[] carsInput) {
        return Arrays.stream(carsInput)
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return cars;
    }

    public Integer getWinnerPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElseThrow(IllegalArgumentException::new);
    }

    public void moveAll(NumberGenerator numberGenerator) {
        cars.stream()
                .forEach(car -> car.moveForward(numberGenerator.generateRandomNumber()));
    }
}
