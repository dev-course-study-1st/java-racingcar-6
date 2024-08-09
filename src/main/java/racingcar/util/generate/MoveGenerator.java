package racingcar.util.generate;

import racingcar.util.constant.NumberEnum;

public class MoveGenerator implements Generator{
    @Override
    public int generate() {
        return NumberEnum.FOUR.getValue();
    }
}
