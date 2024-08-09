package racingcar.utils.generator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.utils.enums.GameNumber;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomNumberGeneratorTest {

    private final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    @DisplayName("0부터 9사이 수인지 테스트")
    @Test
    public void checkRandom() {
        int random = randomNumberGenerator.generate();
        assertTrue(GameNumber.MIN.getNumber() <= random && random <= GameNumber.MAX.getNumber());
    }

}