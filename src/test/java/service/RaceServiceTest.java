package service;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.CarGarage;
import racingcar.domain.RoundResult;
import racingcar.domain.Winner;
import racingcar.service.RaceService;
import util.MovingNumberNumberGenerator;
import util.StayNumberGenerator;

public class RaceServiceTest {

    private final RaceService movingRaceService = new RaceService(new MovingNumberNumberGenerator());
    private final RaceService stayRaceService = new RaceService(new StayNumberGenerator());

    @Test
    @DisplayName("레이싱 테스트")
    void raceTest() {
        //given
        CarGarage carGarage = new CarGarage(List.of(
                new Car("Car1"),
                new Car("Car2"),
                new Car("Car3")
        ));

        //when
        RoundResult result1 = movingRaceService.race(carGarage);
        RoundResult result2 = stayRaceService.race(carGarage);
        RoundResult result3 = movingRaceService.race(carGarage);

        //then
        assertThat(result1.value().get("Car1")).isEqualTo(1);
        assertThat(result1.value().get("Car2")).isEqualTo(1);
        assertThat(result1.value().get("Car3")).isEqualTo(1);

        assertThat(result2.value().get("Car1")).isEqualTo(1);
        assertThat(result2.value().get("Car2")).isEqualTo(1);
        assertThat(result2.value().get("Car3")).isEqualTo(1);

        assertThat(result3.value().get("Car1")).isEqualTo(2);
        assertThat(result3.value().get("Car2")).isEqualTo(2);
        assertThat(result3.value().get("Car3")).isEqualTo(2);
    }

    @Test
    @DisplayName("승자 테스트 - 한명")
    void findWinnerTest_Only_One() {
        //given
        Car car1 = new Car("Car1");
        Car car2 = new Car("Car2");
        Car car3 = new Car("Car3");

        car1.moveOrStay(5);
        car1.moveOrStay(5);
        car1.moveOrStay(5);
        car1.moveOrStay(5);

        car2.moveOrStay(5);
        car2.moveOrStay(2);
        car2.moveOrStay(2);
        car2.moveOrStay(5);

        car3.moveOrStay(5);
        car3.moveOrStay(2);
        car3.moveOrStay(2);
        car3.moveOrStay(2);

        CarGarage carGarage = new CarGarage(List.of(
                car1, car2, car3
        ));

        //when
        Winner winner = movingRaceService.findWinner(carGarage);

        //then
        assertThat(winner.value().size()).isEqualTo(1);
        assertThat(winner.value()).contains(car1.getName());
    }

    @Test
    @DisplayName("승자 테스트 - 여러명")
    void findWinnerTest_Many() {
        //given
        Car car1 = new Car("Car1");
        Car car2 = new Car("Car2");
        Car car3 = new Car("Car3");

        car1.moveOrStay(5);
        car1.moveOrStay(5);
        car1.moveOrStay(5);
        car1.moveOrStay(5);

        car2.moveOrStay(5);
        car2.moveOrStay(5);
        car2.moveOrStay(5);
        car2.moveOrStay(5);

        car3.moveOrStay(5);
        car3.moveOrStay(2);
        car3.moveOrStay(2);
        car3.moveOrStay(2);

        CarGarage carGarage = new CarGarage(List.of(
                car1, car2, car3
        ));

        //when
        Winner winner = movingRaceService.findWinner(carGarage);

        //then
        assertThat(winner.value().size()).isEqualTo(2);
        assertThat(winner.value()).contains(car1.getName(), car2.getName());
    }


}
