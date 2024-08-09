package racingcar.util.constant;

public enum StringEnum {

    PRINT_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),

    PRINT_COUNT("시도할 회수는 몇회인가요?"),
    PRINT_WINNERS("최종 우승자 : "),
    COMMA(",");

    private final String string;
    StringEnum(String string) {
        this.string = string;
    }

    public String toString() {
        return string;

    }
}
