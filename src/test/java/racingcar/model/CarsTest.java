package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.utils.RandomNumberGenerator;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CarsTest {

    final String[] carNames = {"carA", "carB", "carC"};

    @DisplayName("winner를 찾는다")
    @Test
    void findWinner() {
        // given
        Cars cars = new Cars(carNames);
        cars.getCars().get(0).moveForward(9);
        cars.getCars().get(1).moveForward(9);
        cars.getCars().get(2).moveForward(1);

        // when
        List<Car> winners = cars.getWinners();

        // then
        assertThat(winners)
                .extracting("name")
                .containsExactly("carA", "carB");

    }

    @DisplayName("모든 자동차를 전진시킨다")
    @Test
    void moveAll() {
        // given
        Cars cars = new Cars(carNames);

        RandomNumberGenerator numberGenerator = new RandomNumberGenerator();

        // when
        cars.moveAll(numberGenerator, 4, 9);

        // then
        assertThat(cars.getCars())
                .extracting("position")
                .containsExactly(1, 1, 1);
    }

}
