package racingcar.util.valid;

import racingcar.util.constant.NumberEnum;
import racingcar.util.constant.StringEnum;

import static racingcar.util.constant.StringEnum.EMPTY_NAME_ERROR_MESSAGE;
import static racingcar.util.constant.StringEnum.NAME_LENGTH_ERROR_MESSAGE;

public class NameValidator implements Validator<String> {

    @Override
    public String validate(String value) {
        for (String name : value.split(StringEnum.COMMA.toString())) {
            checkNameEmpty(name)
                    .checkNameLength(name)
                    .finish();
        }

        return value;
    }

    private NameValidator checkNameEmpty(String name) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException(EMPTY_NAME_ERROR_MESSAGE.toString());
        }

        return this;
    }

    private NameValidator checkNameLength(String name) {
        if (name.length() > NumberEnum.FIVE.getValue()) {
            throw new IllegalArgumentException(NAME_LENGTH_ERROR_MESSAGE.toString());
        }

        return this;
    }

}
