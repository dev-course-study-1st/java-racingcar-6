package racingcar.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class InputValidatorTest {

    @DisplayName("입력값이 정수가 아닐 때 IllegalArgumentException 발생")
    @Test
    void shouldThrowIllegalArgumentExceptionWhenInputIsNotInteger() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> InputValidator.isInteger("min"));
    }

    @DisplayName("입력값이 정수이면 Exception 발생하지 않음")
    @Test
    void shouldNotThrowExceptionWhenInputIsInteger() {
        assertThatCode(() -> InputValidator.isInteger("123"))
                .doesNotThrowAnyException();
    }

    @DisplayName("자동차 이름이 영문이나 콤마가 아닌 경우 IllegalArgumentException 발생")
    @Test
    void shouldThrowIllegalArgumentExceptionWhenCarNameIsNotAlphabetOrComma() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> InputValidator.isCarNameInput("carA12.carB,carC"));
    }

    @DisplayName("자동차 이름이 영문이나 콤마인 경우 Exception 발생하지 않음")
    @Test
    void shouldNotThrowExceptionWhenCarNameIsAlphabetOrComma() {
        assertThatCode(() -> InputValidator.isCarNameInput("carA,carB,carC"))
                .doesNotThrowAnyException();
    }
}
