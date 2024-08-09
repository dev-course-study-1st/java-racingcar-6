package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.Application;
import racingcar.util.constant.NumberEnum;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest extends NsTest {


    @Override
    public void runMain() {
        Application.main(new String[]{});
    }

    @Test
    @DisplayName("우승자가 2명 이상일 때")
    void winnerIsOverThanTwo() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("pobi,woni,yoo", "2");
                    assertThat(output()).contains("pobi : --", "woni : --", "yoo : ", "최종 우승자 : pobi,woni");
                }, NumberEnum.FOUR.getValue(), NumberEnum.FOUR.getValue(), NumberEnum.THREE.getValue()
                , NumberEnum.FOUR.getValue(), NumberEnum.FOUR.getValue(), NumberEnum.THREE.getValue()
        );
    }

}
