package racingcar.utils.validator;

import racingcar.utils.enums.GameMessage;

public class NameValidator implements Validator<String[]> {

    @Override
    public String[] validate(String input) {
        String[] names = input.split(",");
        for (String name : names) {
            validateLength(name);
        }
        return names;
    }

    private void validateLength(String name) {
        if (name.length() > 5)
            throw new IllegalArgumentException(GameMessage.INVALID_CAR_NAME.toString());
    }
}
