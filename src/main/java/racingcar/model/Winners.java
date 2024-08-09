package racingcar.model;

import java.util.List;

public class Winners {

    private final List<String> winners;

    public Winners(Cars cars)
    {
        this.winners = cars.carToString();
    }

    public List<String> getWinners() {
        return winners;
    }

}
