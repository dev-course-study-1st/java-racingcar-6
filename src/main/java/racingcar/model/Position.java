package racingcar.model;

public class Position {
    private int distance;

    public Position(int distance) {
        this.distance = distance;
    }

    public void increment(){
        distance++;
    }

    public boolean isAheadOf(Position position){
        return this.distance > position.distance;
    }

    public boolean isDrawWith(Position position){
        return this.distance == position.distance;
    }

}
