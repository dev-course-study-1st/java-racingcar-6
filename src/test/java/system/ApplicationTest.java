package system;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;
import racingcar.Application;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 전진_정지() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("pobi,woni", "5");
                    assertThat(output()).contains(
                            "pobi : -", "woni : ",
                            "pobi : --", "woni : -",
                            "pobi : --", "woni : --",
                            "pobi : ---", "woni : --",
                            "pobi : ----", "woni : --",
                            "최종 우승자 : pobi");
                },
                MOVING_FORWARD, STOP,
                MOVING_FORWARD, MOVING_FORWARD,
                STOP, MOVING_FORWARD,
                MOVING_FORWARD, STOP,
                MOVING_FORWARD, STOP
        );
    }

    @Test
    void 전진_정지2() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("pobi,woni,an", "5");
                    assertThat(output()).contains(
                            "pobi : -", "woni : ", "an : -",
                            "pobi : --", "woni : -", "an : --",
                            "pobi : --", "woni : --", "an : --",
                            "pobi : ---", "woni : --", "an : ---",
                            "pobi : ----", "woni : --", "an : ----",
                            "최종 우승자 : pobi, an");
                },
                MOVING_FORWARD, STOP, MOVING_FORWARD,
                MOVING_FORWARD, MOVING_FORWARD, MOVING_FORWARD,
                STOP, MOVING_FORWARD, STOP,
                MOVING_FORWARD, STOP, MOVING_FORWARD,
                MOVING_FORWARD, STOP, MOVING_FORWARD
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
