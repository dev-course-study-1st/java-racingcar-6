package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.enums.GameMessage;
import racingcar.utils.validator.Validator;

public class InputView {
    private final Validator<String[]> nameValidator;
    private final Validator<Integer> numberValidator;

    public InputView(Validator<String[]> nameValidator, Validator<Integer> numberValidator) {
        this.nameValidator = nameValidator;
        this.numberValidator = numberValidator;
    }

    public String[] getCarNames() {
        System.out.println(GameMessage.INPUT_CAR_NAMES);
        String input = Console.readLine();
        return nameValidator.validate(input);
    }

    public int getAttemptCount() {
        System.out.println(GameMessage.INPUT_CAR_NAMES);
        String input = Console.readLine();
        return numberValidator.validate(input);
    }
}
