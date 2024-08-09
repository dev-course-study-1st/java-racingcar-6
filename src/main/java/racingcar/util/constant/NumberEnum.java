package racingcar.util.constant;

import static java.util.Arrays.stream;

public enum NumberEnum {

    ZERO(0),
    ONE(1), TWO(2), THREE(3),
    FOUR(4), LEAST_MOVE_AVAILABLE(4),
    FIVE(5), SIX(6), SEVEN(7),
    EIGHT(8),NINE(9);


    private final int moveForward;
    NumberEnum(int forward) {
        this.moveForward = forward;
    }

    public int getValue() {
        return this.moveForward;
    }

}
