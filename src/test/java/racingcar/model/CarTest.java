package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class CarTest {

    @DisplayName("자동차가 이름이 5글자가 넘거나 비어있으면 예외를 던진다")
    @ParameterizedTest
    @CsvSource(value = {"''", "casdfd", "oifjbxvcz"})
    void shouldThrowExceptionCarNameLengthIsOver5(String carName) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> new Car(carName));
    }

    @DisplayName("자동차의 이름이 1글자 이상 5글자 이하이면 예외를 던지지 않는다")
    @ParameterizedTest
    @CsvSource(value = {"tobi", "jun", "hi", "a", "qwert"})
    void shouldDoesNotThrowExceptionNameLengthIs1to5(String carName) {
        assertThatCode(() -> new Car(carName))
                .doesNotThrowAnyException();
    }

    @DisplayName("0~3 사이의 수는 움직이지 않는다")
    @ParameterizedTest
    @CsvSource(value = {"0", "1", "2", "3"})
    void shouldNotMoveWhenRandomNumberIs0to3(int randomNumber) {
        Car car = new Car("car");
        car.moveForward(randomNumber);
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @DisplayName("4~9 사이의 수는 움직인다")
    @ParameterizedTest
    @CsvSource(value = {"4", "5", "6", "7", "8", "9"})
    void shouldMoveWhenRandomNumberIs4to9(int randomNumber) {
        Car car = new Car("car");
        car.moveForward(randomNumber);
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
