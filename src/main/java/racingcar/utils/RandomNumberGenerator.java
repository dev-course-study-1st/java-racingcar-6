package racingcar.utils;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {
    public int generateNumber(int min, int max) {
        return Randoms.pickNumberInRange(min, max);
    }
}
