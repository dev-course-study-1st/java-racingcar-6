package racingcar.util;

public enum Const {

    MOVING_STANDARD(4),
    START_POSITION(0),
    MAX_VALUE(9),
    MIN_VALUE(0);

    private final int value;

    Const(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
