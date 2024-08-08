package racingcar.model;

import racingcar.utils.validator.InputValidator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(String[] carsInput) {
        this.cars = generateCars(carsInput);
    }

    private void validateCars(String[] carsInput) {
        for (String carName : carsInput) {
            InputValidator.isCarNameLength(carName);
        }
    }

    private List<Car> generateCars(String[] carsInput) {
        validateCars(carsInput);
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
}
