package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.util.valid.MoveForwardValidator;
import racingcar.util.valid.Validator;

public class Car {
    private String name;
    private int moveDistance;

    private static final Validator<Integer> validator = new MoveForwardValidator();

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMoveDistance() {
        return moveDistance;
    }

    public void move(int distance) {
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
