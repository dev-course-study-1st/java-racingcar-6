package racingcar.view;

import racingcar.model.Car;
import racingcar.util.constant.StringEnum;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {

    public static void printMoveDistance(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
    }

    public static void printWinners(List<Car> cars) {
        String winners = cars.stream()
                .filter(car -> car.getLocation() == getMax(cars))
                .map(Car::getName).collect(Collectors.joining(","));

        System.out.println(StringEnum.PRINT_WINNERS + winners);
    }

    private static int getMax(List<Car> cars) {
        return cars.stream()
                    .mapToInt(Car::getLocation)
                    .max()
                    .getAsInt();
    }
}
