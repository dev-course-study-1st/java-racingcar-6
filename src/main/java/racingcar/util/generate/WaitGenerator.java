package racingcar.util.generate;

import racingcar.util.constant.NumberEnum;
import racingcar.util.valid.Validator;

public class WaitGenerator implements Generator {

    @Override
    public int generate() {
        return NumberEnum.TWO.getValue();
    }
}
