package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.utils.constant.GameNumber;

public class NumberGenerator {
    public int generateRandomNumber() {
        return Randoms.pickNumberInRange(GameNumber.RANDOM_MIN.getNumber(),GameNumber.RANDOM_MAX.getNumber());
    }
}
