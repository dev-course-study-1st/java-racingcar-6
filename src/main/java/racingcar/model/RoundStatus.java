package racingcar.model;

import java.util.Map;

public class RoundStatus {
    private final Map<String, Integer> status;

    public RoundStatus(Cars cars) {
        this.status = cars.carToMap();
    }

    public Map<String, Integer> getStatus() {
        return status;
    }

}
