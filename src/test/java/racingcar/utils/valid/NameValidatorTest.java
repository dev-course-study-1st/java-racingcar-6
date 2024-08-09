package racingcar.utils.valid;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.util.constant.StringEnum;
import racingcar.util.valid.NameValidator;
import racingcar.util.valid.Validator;

import static org.assertj.core.api.Assertions.*;

public class NameValidatorTest {
    private final Validator<String> nameValidator = new NameValidator();

    @Test
    @DisplayName("정상실행")
    void normalTest() {
        String testStr = "test1,test2,test3";
        assertThat(nameValidator.validate(testStr)).isEqualTo(testStr);
    }

    @Test
    @DisplayName("이름의 길이가 5자를 초과하면 예외를 던짐")
    void nameLengthOverTest() {
        String testStr = "test1,testGgg,test3";

        assertThatThrownBy(() -> nameValidator.validate(testStr))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(StringEnum.NAME_LENGTH_ERROR_MESSAGE.toString());
    }
}
