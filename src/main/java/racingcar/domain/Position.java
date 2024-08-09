package racingcar.domain;

import static racingcar.util.Const.START_POSITION;

public class Position {

    private int value;

    public Position() {
        this.value = START_POSITION.getValue();
    }

    public void goForward() {
        this.value++;
    }

    public int getValue() {
        return value;
    }
}
