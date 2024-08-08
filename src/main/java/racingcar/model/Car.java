package racingcar.model;

import racingcar.utils.enums.GameNumber;
import racingcar.utils.generator.NumberGenerator;

import java.util.HashMap;

public class Car {
    private Name name;
    private Position position;

    public Car(Name name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String getName(){
        return name.getValue();
    }

    public int getPosition(){
        return position.getDistance();
    }

    private void move() {
        position.increment();
    }

    public void tryMove(NumberGenerator numberGenerator) {
        if (numberGenerator.generate() >= GameNumber.MOVE_STANDARD.getNumber()) {
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
