package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Cars;
import racingcar.utils.converter.CarListConverter;
import racingcar.utils.enums.GameMessage;
import racingcar.utils.validator.Validator;

public class InputView {

    private final Validator<String[]> nameValidator;
    private final Validator<Integer> numberValidator;
    private final CarListConverter carListConverter;

    public InputView(Validator<String[]> nameValidator, Validator<Integer> numberValidator, CarListConverter carListConverter) {
        this.nameValidator = nameValidator;
        this.numberValidator = numberValidator;
        this.carListConverter = carListConverter;
    }

    public Cars getCarNames() {
        String[] carNames = inputCarNames();
        return carListConverter.convert(carNames);
    }

    private String[] inputCarNames() {
        System.out.println(GameMessage.INPUT_CAR_NAMES);
        String input = Console.readLine();
        return nameValidator.validate(input);
    }

    public int getAttemptCount() {
        System.out.println(GameMessage.INPUT_ATTEMPT_COUNT);
        String input = Console.readLine();
        return numberValidator.validate(input);
    }

}
