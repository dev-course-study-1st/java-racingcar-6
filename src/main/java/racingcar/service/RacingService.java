package racingcar.service;

import racingcar.model.Car;
import racingcar.util.constant.StringEnum;
import racingcar.util.generate.Generator;
import racingcar.util.valid.NameValidator;
import racingcar.util.valid.RoundValidator;
import racingcar.util.valid.Validator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingService {

    private final Validator<String> nameValidator;
    private final Validator<String> roundValidator;
    private final Generator randomGenerator;

    public RacingService(Generator generator) {
        this.nameValidator = new NameValidator();
        this.roundValidator = new RoundValidator();
        this.randomGenerator = generator;
    }

    public String validateName(String s) {
        return nameValidator.validate(s);
    }

    public List<Car> createCars(String names) {
        return Arrays.stream(names.split(StringEnum.COMMA.toString()))
                    .map(Car::new)
                    .collect(Collectors.toList());
    }

    public void moveOrWait(List<Car> cars) {
        for (Car car : cars) {
            car.moveOrWait(randomGenerator.generate());
        }
    }

    public String validateRound(String s) {
        return roundValidator.validate(s);
    }
}
