package racingcar.model;

import racingcar.utils.generator.NumberGenerator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
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

    public List<String> carToString(){
        return carList.stream()
                .map(Car::getName)
                .toList();
    }

    public Map<String,Integer> carToMap(){
        return carList.stream()
                .collect(Collectors.toMap(Car::getName, Car::getPosition)) ;
    }

}
