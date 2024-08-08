package racingcar.utils.converter;

import racingcar.model.Car;
import racingcar.model.CarList;
import racingcar.model.Name;
import racingcar.model.Position;
import racingcar.utils.enums.GameNumber;

import java.util.Arrays;
import java.util.List;

public class CarListConverter {

    public CarList convert(String[] carNames){
        List<Car> carList = Arrays.stream(carNames)
                .map(name -> new Car(new Name(name), new Position(GameNumber.START_POSITION.getNumber())))
                .toList();
        return new CarList(carList);
    }

}
