package racingcar.util.generator;

import static racingcar.util.Const.*;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements NumberGenerator{

    @Override
    public int generate() {
        return Randoms.pickNumberInRange(MIN_VALUE.getValue(), MAX_VALUE.getValue());
    }
}
