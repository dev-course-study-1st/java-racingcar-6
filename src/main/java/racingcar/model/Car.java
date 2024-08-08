package racingcar.model;

import racingcar.utils.constant.GameNumber;

public class Car {
    private final String name;
    private Integer position;

    public Car(String carName) {
        this.name = carName;
        this.position = GameNumber.DEFAULT_FORWARD_COUNT.getNumber();
    }

    public void moveForward() {
        this.position++;
    }

    public String getName() {
        return name;
    }

    public Integer getPosition() {
        return position;
    }
}

