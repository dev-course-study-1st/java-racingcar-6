package racingcar.util.constant;

public enum StringEnum {

    PRINT_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    PRINT_COUNT("시도할 회수는 몇회인가요?"),
    PRINT_WINNERS("최종 우승자 : "),
    COMMA(","),
    NAME_LENGTH_ERROR_MESSAGE("이름의 길이가 6자 이상입니다."),
    CONTAINS_LETTER_ERROR_MESSAGE("숫자가 아닌 문자가 포함되어 있습니다."),
    LESS_THAN_ONE_ERROR_MESSAGE("1보다 작은 숫자를 입력할 수 없습니다.");

    private final String string;

    StringEnum(String string) {
        this.string = string;
    }

    public String toString() {
        return string;
    }
}
