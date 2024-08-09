package racingcar.model;

import racingcar.util.valid.MoveOrWaitValidator;
import racingcar.util.valid.Validator;

public class Car {

    private final Name name;
    private final Location location;
    private static final Validator<Integer> validator = new MoveOrWaitValidator();

    public Car(String name) {
        this.name = new Name(name);
        this.location = new Location();
    }

    public String getName() {
        return name.getName();
    }

    public int getLocation() {
        return location.getLocation();
    }

    public void moveOrWait(int distance) {
        location.changeLocation(validator.validate(distance));
    }

    @Override
    public String toString() {
        return new StringBuilder(this.name.getName())
                    .append(" : ")
                    .append("-".repeat(location.getLocation()))
                    .toString();

    }
}
