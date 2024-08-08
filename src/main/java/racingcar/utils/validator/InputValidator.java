package racingcar.utils.validator;

import racingcar.utils.constant.GameNumber;

public class InputValidator {
    private final static String IS_INTEGER_PATTERN = "^[0-9]*$";

    public static void isInteger(String inputString) {
        if (!inputString.matches(IS_INTEGER_PATTERN)) {
            throw new IllegalArgumentException("정수가 아닙니다.");
        }
    }

    public static void isCarNameInput(String inputString) {
        if (!inputString.matches("^[a-zA-Z,]*$")) {
            throw new IllegalArgumentException("영문자와 쉼표만 입력해주세요.");
        }
    }

    public static void isCarNameLength(String inputString) {
        if (inputString.length() > GameNumber.MAX_NAME_LENGTH.getNumber()) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }
}
