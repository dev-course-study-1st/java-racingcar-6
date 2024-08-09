package racingcar.util.valid;

import racingcar.util.constant.NumberEnum;

public class MoveOrWaitValidator implements Validator<Integer>{

    @Override
    public Integer validate(Integer value) {
        if(value < NumberEnum.LEAST_MOVE_AVAILABLE.getValue()) {
            return NumberEnum.ZERO.getValue();
        }

        return value;
    }
}
