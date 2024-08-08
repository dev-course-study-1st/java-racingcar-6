package racingcar.utils.generator;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.utils.enums.GameNumber;

public class RandomNumberGenerator implements NumberGenerator {
    @Override
    public int generate() {
        return Randoms.pickNumberInRange(GameNumber.MIN.getNumber(), GameNumber.MAX.getNumber());
    }
    
}
