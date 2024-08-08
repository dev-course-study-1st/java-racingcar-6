package racingcar.service;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.model.RoundStatus;
import racingcar.model.Winners;
import racingcar.utils.generator.NumberGenerator;

import java.util.HashMap;
import java.util.List;

public class RaceService {
    private final NumberGenerator numberGenerator;

    public RaceService(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public RoundStatus race(Cars cars){
        cars.moveCars(numberGenerator);
        return getRoundStatus(cars);
    }

    public RoundStatus getRoundStatus(Cars cars) {
        return new RoundStatus(createRoundStatus(cars.getCarList()));
    }

    public HashMap<String, Integer> createRoundStatus(List<Car> carList) {
        HashMap<String, Integer> roundStatus = new HashMap<>();
        for (Car car : carList) {
            roundStatus.put(car.getName(), car.getPosition());
        }
        return roundStatus;
    }
    
    public Winners getWinners(Cars cars) {
        return new Winners(findWinners(cars));
    }

    public List<String> findWinners(Cars cars){
       return cars.getWinners()
                .stream()
                .map(Car::getName)
                .toList();
    }
}
