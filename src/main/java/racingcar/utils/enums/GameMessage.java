package racingcar.utils.enums;

public enum GameMessage {
    INPUT_CAR_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_ATTEMPT_COUNT("시도할 회수는 몇회인가요?"),
    INVALID_CAR_NAME("자동차 이름은 5자 이하만 가능합니다."),
    INVALID_ATTEMPT_COUNT("시도 횟수는 양의 정수이어야 합니다."),
    OUTPUT_ROUND_STATUS("실행 결과"),
    OUTPUT_WINNERS("최종 우승자 : ");


    private final String message;

    GameMessage(String message){
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
