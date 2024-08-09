package racingcar.utils.valid;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.util.constant.StringEnum;
import racingcar.util.valid.RoundValidator;
import racingcar.util.valid.Validator;

import static org.assertj.core.api.Assertions.*;

public class RoundValidatorTest {

    private final Validator<String> roundValidator = new RoundValidator();

    @Test
    @DisplayName("정상실행")
    void normalTest() {
        String round = "3";
        assertThat(roundValidator.validate(round)).isEqualTo(round);
    }

    @Test
    @DisplayName("입력한 라운드가 음수일 때")
    void negativeRoundTest() {
        String round = "-3";
        assertThatThrownBy(() -> roundValidator.validate(round))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(StringEnum.LESS_THAN_ONE_ERROR_MESSAGE.toString());
    }

    @Test
    @DisplayName("입력한 라운드에 숫자가 아닌 문자열이 있을 때")
    void containsLetterTest() {
        String round = "-3#DDASC";
        assertThatThrownBy(() -> roundValidator.validate(round))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(StringEnum.CONTAINS_LETTER_ERROR_MESSAGE.toString());
    }
}
