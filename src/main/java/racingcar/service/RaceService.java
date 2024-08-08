package racingcar.service;

import racingcar.model.Car;
import racingcar.model.CarList;
import racingcar.model.RoundStatus;
import racingcar.utils.generator.NumberGenerator;
import racingcar.view.InputView;

import java.util.HashMap;
import java.util.List;

public class RaceService {
    private final CarList carList;
    private final NumberGenerator numberGenerator;

    public RaceService(CarList carList, NumberGenerator numberGenerator) {
        this.carList = carList;
        this.numberGenerator = numberGenerator;
    }

    public RoundStatus race(){
        carList.moveCars(numberGenerator);
        return getRoundStatus();
    }

    public RoundStatus getRoundStatus() {
        return new RoundStatus(createRoundStatus(carList.getCarList()));
    }

    public HashMap<String, Integer> createRoundStatus(List<Car> carList) {
        HashMap<String, Integer> roundStatus = new HashMap<>();
        for (Car car : carList) {
            roundStatus.put(car.getName(), car.getPosition());
        }
        return roundStatus;
    }

    public List<Car> getWinners(){
        return carList.getWinners();
    }

}
