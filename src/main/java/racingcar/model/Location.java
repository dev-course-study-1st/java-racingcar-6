package racingcar.model;

public class Location {

    private int location;

    public void changeLocation(int forward) {
        location += forward;
    }

    public int getLocation() {
        return location;
    }
}
