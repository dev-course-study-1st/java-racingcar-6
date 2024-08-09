package racingcar.view;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.*;
import racingcar.Application;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputViewTest extends NsTest {

    @DisplayName("5글자 초과 이름 테스트")
    @Test
    public void checkNames()  {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("whaledma1,java", "1"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @DisplayName("시도 횟수 숫자 아닌 경우 테스트")
    @Test
    public void checkNotNumber()  {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("whale,java", "asd"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @DisplayName("시도 횟수 음수인 경우 테스트")
    @Test
    public void checkNotPositive()  {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("whale,java", "-2"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @DisplayName("시도 횟수 0시작 수인 경우 테스트")
    @Test
    public void checkNotForm()  {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("whale,java", "0123"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }

}