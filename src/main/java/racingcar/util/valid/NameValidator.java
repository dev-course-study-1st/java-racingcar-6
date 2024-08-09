package racingcar.util.valid;

import racingcar.util.constant.NumberEnum;
import racingcar.util.constant.StringEnum;

import static racingcar.util.constant.StringEnum.NAME_LENGTH_ERROR_MESSAGE;

public class NameValidator implements Validator<String>{

    @Override
    public String validate(String value) {
        for (String name : value.split(StringEnum.COMMA.toString())) {
            isNameEmpty(name)
                    .isNameLengthIsOverThanLimit(name)
                    .finish();
        }

        return value;
    }

    private NameValidator isNameEmpty(String name) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException(NAME_LENGTH_ERROR_MESSAGE.toString());
        }

        return this;
    }

    private NameValidator isNameLengthIsOverThanLimit(String name) {
        if (name.length() > NumberEnum.FIVE.getValue()) {
            throw new IllegalArgumentException(NAME_LENGTH_ERROR_MESSAGE.toString());
        }

        return this;
    }

}
