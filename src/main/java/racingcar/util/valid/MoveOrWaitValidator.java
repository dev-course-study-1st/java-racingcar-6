package racingcar.util.valid;

import racingcar.util.constant.MoveOrWait;

public class MoveOrWaitValidator implements Validator<Integer>{

    @Override
    public Integer validate(Integer value) {
        return judgeMoveOrWait(value).getValue();
    }

    private MoveOrWait judgeMoveOrWait(Integer value) {
        if(value < MoveOrWait.LEAST_MOVE_AVAILABLE.getValue()) {
            return MoveOrWait.WAIT;
        }

        return MoveOrWait.MOVE;
    }
}
