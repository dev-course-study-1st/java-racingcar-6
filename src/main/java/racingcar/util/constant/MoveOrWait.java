package racingcar.util.constant;

public enum MoveOrWait {

    WAIT(0),
    MOVE(1),
    LEAST_MOVE_AVAILABLE(4);

    private final int value;

    MoveOrWait(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
