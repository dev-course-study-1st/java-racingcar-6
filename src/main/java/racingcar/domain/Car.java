package racingcar.domain;

public class Car {

    private final Name name;
    private final Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public void moveOrStay(int standard) {
        if (standard >= 4) {
            position.goForward();
        }
    }

    public String getName() {
        return name.value();
    }

    public int getPosition() {
        return position.getValue();
    }
}
