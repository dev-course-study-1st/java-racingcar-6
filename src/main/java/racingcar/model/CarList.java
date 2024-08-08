package racingcar.model;

import racingcar.utils.generator.NumberGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarList {
    private final List<Car> carList;

    public CarList(List<Car> carList) {
        this.carList = carList;
    }

    public void moveCars(NumberGenerator numberGenerator) {
        for (Car car : carList) {
            car.tryMove(numberGenerator);
        }
    }

    public List<Car> getCarList(){
        return carList;
    }

    public List<Car> getWinners() {
        Car winner = carList.get(0);
        for (Car car : carList) {
            if (car.isAheadOf(winner))
                winner = car;
        }
        List<Car> winners = new ArrayList<>();
        for (Car car : carList) {
            if (car.isDrawWith(winner))
                winners.add(car);
        }
        return winners;
    }

}
