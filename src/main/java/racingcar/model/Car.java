package racingcar.model;

import racingcar.util.valid.MoveOrWaitValidator;
import racingcar.util.valid.Validator;

public class Car {
    private String name;
    private int moveDistance;

    private static final Validator<Integer> validator = new MoveOrWaitValidator();

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMoveDistance() {
        return moveDistance;
    }

    public void moveOrWait(int distance) {
        moveDistance += validator.validate(distance);
    }

    @Override
    public String toString() {
        return new StringBuilder(this.name)
                    .append(" : ")
                    .append("-".repeat(moveDistance))
                    .toString();

    }
}
