package racingcar.utils.validator;

import racingcar.utils.enums.GameMessage;

public class NumberValidator implements Validator<Integer> {

    @Override
    public Integer validate(String input) {
        if (!input.matches("^[^0]\\d*")) {
            throw new IllegalArgumentException(GameMessage.INVALID_ATTEMPT_COUNT.toString());
        }
        return Integer.parseInt(input);
    }

}
