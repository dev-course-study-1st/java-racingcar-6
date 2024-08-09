package racingcar.util.generate;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.util.constant.NumberEnum;

public class RandomGenerator implements Generator{
    @Override
    public int generate() {
        return Randoms.pickNumberInRange(NumberEnum.ONE.getNumber(), NumberEnum.NINE.getNumber());
    }
}
