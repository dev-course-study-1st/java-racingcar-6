package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.utils.enums.GameNumber;
import racingcar.utils.generator.FixedNumberGenerator;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private final Car car = new Car(new Name("조믿음"), new Position(GameNumber.START_POSITION.getNumber()));

    @DisplayName("4미만 정지 테스트")
    @Test
    public void checkStop() {
        car.tryMove(new FixedNumberGenerator(3));
        assertEquals(GameNumber.START_POSITION.getNumber(), car.getPosition());
    }

    @DisplayName("4이상 이동 테스트")
    @Test
    public void checkMove() {
        car.tryMove(new FixedNumberGenerator(5));
        assertEquals(GameNumber.START_POSITION.getNumber() + 1, car.getPosition());
    }

}