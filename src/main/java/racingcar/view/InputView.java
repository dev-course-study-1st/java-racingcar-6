package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Cars;
import racingcar.utils.converter.CarsConverter;
import racingcar.utils.enums.GameMessage;
import racingcar.utils.validator.Validator;

public class InputView {

    private final Validator<String[]> nameValidator;
    private final Validator<Integer> numberValidator;
    private final CarsConverter carsConverter;

    public InputView(Validator<String[]> nameValidator, Validator<Integer> numberValidator, CarsConverter carsConverter) {
        this.nameValidator = nameValidator;
        this.numberValidator = numberValidator;
        this.carsConverter = carsConverter;
    }

    public Cars getCarNames() {
        String[] carNames = inputCarNames();
        return carsConverter.convert(carNames);
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
