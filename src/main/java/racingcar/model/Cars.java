package racingcar.model;

import racingcar.utils.RandomNumberGenerator;

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

    private Integer getWinnerPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElseThrow(IllegalArgumentException::new);
    }

    public List<Car> getWinners() {
        return cars.stream()
                .filter(car -> car.getPosition().equals(getWinnerPosition()))
                .collect(Collectors.toList());
    }

    public void moveAll(RandomNumberGenerator randomNumberGenerator, int min, int max) {
        cars.stream()
                .forEach(car -> car.moveForward(randomNumberGenerator.generateNumber(min, max)));
    }

    public List<Car> getCars() {
        return cars;
    }
}
