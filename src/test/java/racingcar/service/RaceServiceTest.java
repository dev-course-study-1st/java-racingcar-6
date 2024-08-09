package racingcar.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.*;
import racingcar.utils.generator.NumberGenerator;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class RaceServiceTest {
    
    private RaceService raceService;
    private NumberGenerator numberGenerator;

    @BeforeEach
    public void setup(){
        raceService = new RaceService(numberGenerator);
    }
    
    @DisplayName("우승자 한명 테스트")
    @Test
    public void checkOneWinner() {

        Car car1 = new Car(new Name("Car1"), new Position(3));
        Car car2 = new Car(new Name("Car2"), new Position(2));
        Car car3 = new Car(new Name("Car3"), new Position(4));
        Cars cars = new Cars(Arrays.asList(car1, car2, car3));

        Winners winners = raceService.getWinners(cars);

        List<String> winnerList = winners.getWinners();
        assertEquals(1, winnerList.size());
        assertEquals("Car3", winnerList.get(0));
    }

    @DisplayName("우승자 여러명 테스트")
    @Test
    public void checkWinners() {

        Car car1 = new Car(new Name("Car1"), new Position(3));
        Car car2 = new Car(new Name("Car2"), new Position(2));
        Car car3 = new Car(new Name("Car3"), new Position(3));
        Cars cars = new Cars(Arrays.asList(car1, car2, car3));

        Winners winners = raceService.getWinners(cars);

        List<String> winnerList = winners.getWinners();
        assertEquals(2, winnerList.size());
        assertTrue(winnerList.contains("Car1") && winnerList.contains("Car3"));
    }

}
