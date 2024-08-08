package racingcar.utils.constant;

public enum GameMessage {
    TRY_COUNT_REQUEST_MESSAGE("시도할 회수는 몇회인가요?"),
    CAR_NAME_REQUEST_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    DASH("-"),
    COLON(" : "),
    COMMA(", "),
    RACING_RESULT_MSG("실행 결과"),
    DEFAULT_WINNER_MESSAGE("최종 우승자 : ");

    private final String message;

    GameMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
