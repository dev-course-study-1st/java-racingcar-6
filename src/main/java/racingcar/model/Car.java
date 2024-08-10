package racingcar.model;

import racingcar.utils.constant.GameNumber;

public class Car {
    private final String name;
    private Integer position;

    public Car(String carName) {
        validateCarName(carName);
        this.name = carName;
        this.position = GameNumber.DEFAULT_FORWARD_COUNT.getNumber();
    }

    public void moveForward(int number) {
        if (number >= GameNumber.IS_MOVABLE.getNumber()) {
            this.position++;
        }
    }

    private void validateCarName(String carName) {
        if (carName.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (carName.length() > GameNumber.MAX_NAME_LENGTH.getNumber()) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public Integer getPosition() {
        return position;
    }
}

