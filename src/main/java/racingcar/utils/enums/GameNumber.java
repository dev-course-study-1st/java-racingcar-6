package racingcar.utils.enums;

public enum GameNumber {
    START_POSITION(0),
    MOVE_STANDARD(4);

    private final int number;

    GameNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
