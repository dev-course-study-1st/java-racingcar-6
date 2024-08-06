package racingcar.domain;

public class Position {

    private int value;

    public Position() {
        this.value = 0;
    }

    public void goForward() {
        this.value++;
    }
}
