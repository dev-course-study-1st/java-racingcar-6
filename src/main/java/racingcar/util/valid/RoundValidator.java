package racingcar.util.valid;

import racingcar.util.constant.NumberEnum;

import static racingcar.util.constant.StringEnum.CONTAINS_LETTER_ERROR_MESSAGE;
import static racingcar.util.constant.StringEnum.LESS_THAN_ONE_ERROR_MESSAGE;

public class RoundValidator implements Validator<String> {

    @Override
    public String validate(String value) {
         canParseToInteger(value)
                 .isPositiveRound(value)
                 .finish();

         return value;
    }

    private RoundValidator canParseToInteger(String value) {
        if (value.matches(".*[^-0-9].*")) {
            throw new IllegalArgumentException(CONTAINS_LETTER_ERROR_MESSAGE.toString());
        }

        return this;
    }

    private RoundValidator isPositiveRound(String value) {
        if(Integer.parseInt(value) <= NumberEnum.ZERO.getValue()) {
            throw new IllegalArgumentException(LESS_THAN_ONE_ERROR_MESSAGE.toString());
        }

        return this;
    }
}

