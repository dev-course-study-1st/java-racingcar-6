package racingcar.service;

import racingcar.model.Car;
import racingcar.util.constant.StringEnum;
import racingcar.util.generate.Generator;
import racingcar.util.valid.Validator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingService {

    private final Validator<String> nameValidator;
    private final Generator generator;

    public RacingService(Validator<String> nameValidator, Generator generator) {
        this.nameValidator = nameValidator;
        this.generator = generator;
    }
    public String validateName(String s) {
        return nameValidator.validate(s);
    }

    public List<Car> createCars(String names) {
        return Arrays.stream(names.split(StringEnum.COMMA.toString()))
                    .map(Car::new)
                    .collect(Collectors.toList());
    }

    public void play(List<Car> cars) {
        for (Car car : cars) {
            car.move(generator.generate());
        }
    }
}