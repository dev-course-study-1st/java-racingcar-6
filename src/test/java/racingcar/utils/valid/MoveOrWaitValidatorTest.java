package racingcar.utils.valid;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.util.constant.MoveOrWait;
import racingcar.util.constant.NumberEnum;
import racingcar.util.generate.Generator;
import racingcar.util.generate.MoveGenerator;
import racingcar.util.generate.WaitGenerator;
import racingcar.util.valid.MoveOrWaitValidator;
import racingcar.util.valid.Validator;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveOrWaitValidatorTest {

    private final Validator<Integer> mwValidator = new MoveOrWaitValidator();


    @Test
    @DisplayName("이동 여부 정상실행")
    void normalTestForMove() {
        Generator moveGenerator = new MoveGenerator();
        assertThat(mwValidator.validate(moveGenerator.generate()))
                .isEqualTo(MoveOrWait.MOVE.getValue());
    }

    @Test
    @DisplayName("멈춤 여부 정상실행")
    void normalTestForWait() {
        Generator waitGenerator = new WaitGenerator();
        assertThat(mwValidator.validate(waitGenerator.generate()))
                .isEqualTo(MoveOrWait.WAIT.getValue());
    }
}
