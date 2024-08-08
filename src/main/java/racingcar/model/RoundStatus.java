package racingcar.model;

import java.util.HashMap;

public class RoundStatus {
    private final HashMap<String, Integer> status;

    public RoundStatus(HashMap<String, Integer> status) {
        this.status = status;
    }

    public HashMap<String, Integer> getStatus() {
        return status;
    }

}
