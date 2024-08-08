package racingcar.utils.validator;

public class InputValidator {
    private final String IS_INTEGER_PATTERN = "^[0-9]*$";

    public void isInteger(String inputString) {
        if (!inputString.matches(IS_INTEGER_PATTERN)) {
            throw new IllegalArgumentException("정수가 아닙니다.");
        }
    }

    public void isCarNameInput(String inputString) {
        if (!inputString.matches("^[a-zA-Z,]*$")) {
            throw new IllegalArgumentException("영문자와 쉼표만 입력해주세요.");
        }
    }
}
