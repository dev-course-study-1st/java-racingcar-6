package racingcar.utils;

public class NameValidator {

    public String[] validate(String input) {
        String[] names = input.split(",");
        for (String name : names) {
            validateLength(name);
        }
        return names;
    }

    public void validateLength(String name) {
        if (name.length() > 5)
            throw new IllegalArgumentException("유효하지 않은 길이의 이름입니다.");
    }
}
