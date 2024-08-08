package racingcar.model;

import racingcar.utils.generator.NumberGenerator;

public class Car {
    private Name name;
    private Position position;

    public Car(Name name, Position position) {
        this.name = name;
        this.position = position;
    }

    private void move() {
        position.increment();
    }

    public void tryMove(NumberGenerator numberGenerator) {
        if (numberGenerator.generate() >= 4) {
            move();
        }
    }

    public boolean isAheadOf(Car car){
        return this.position.isAheadOf(car.position);
    }

    public boolean isDrawWith(Car car){
        return this.position.isDrawWith(car.position);
    }

}
