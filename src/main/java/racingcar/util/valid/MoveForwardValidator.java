package racingcar.util.valid;

import racingcar.util.constant.NumberEnum;

public class MoveForwardValidator implements Validator<Integer>{

    @Override
    public Integer validate(Integer value) {
        return NumberEnum.getDistance(value);
    }
}
