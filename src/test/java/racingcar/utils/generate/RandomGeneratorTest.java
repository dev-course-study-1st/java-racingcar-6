package racingcar.utils.generate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.util.constant.NumberEnum;
import racingcar.util.generate.Generator;
import racingcar.util.generate.RandomGenerator;

import static org.assertj.core.api.Assertions.*;

public class RandomGeneratorTest {

    private final Generator randomGenerator = new RandomGenerator();

    @Test
    @DisplayName("랜덤 숫자 발생기가 범위 내에서 이동거리가 생성되는 지 테스트")
    void isRandomNumberInRange() {
        assertThat(randomGenerator.generate())
                    .isGreaterThanOrEqualTo(NumberEnum.ONE.getValue())
                    .isLessThanOrEqualTo(NumberEnum.NINE.getValue());
    }
}
