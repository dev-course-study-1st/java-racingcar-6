package system;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;
import racingcar.Application;

public class InputTest extends NsTest {

    @Test
    void 이름에_대한_예외_처리() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("pobi,javaji", "1"))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessage("이름의 길이는 5글자 이하만 가능합니다.")
        );
    }

    @Test
    void 이름에_공백이_있으면_안됩니다() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("pobi,ja vb", "1"))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessage("이름에 공백은 허용하지 않습니다.")
        );
    }

    @Test
    void 이름에_문자와_쉼표_이외으_것은_허용하지_않는다() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("pobi,ja2vb", "1"))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessage("문자와 쉼표(,)만 입력 해주세요.")
        );
    }

    @Test
    void 시도횟수는_공백을_허용하지_않는다() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("pobi,javb", " "))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessage("숫자를 입력해 주세요.")
        );
    }

    @Test
    void 시도횟수는_숫자만_입력_가능하다() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("pobi,javb", "a"))
                        .isInstanceOf(IllegalArgumentException.class)
                        .hasMessage("시도 횟수는 숫자만 입력 가능합니다.")
        );
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
