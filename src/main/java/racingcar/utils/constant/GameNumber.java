package racingcar.utils.constant;

public enum GameNumber {
    DEFAULT_FORWARD_COUNT(0),
    RANDOM_MIN(1),
    RANDOM_MAX(9),
    IS_MOVABLE(4),
    MAX_NAME_LENGTH(5);

    private final int number;

    GameNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
