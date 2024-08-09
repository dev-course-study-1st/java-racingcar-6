package racingcar.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.util.constant.StringEnum;
import racingcar.util.generate.MoveGenerator;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RacingServiceTest {

    private final RacingService racingService = new RacingService(new MoveGenerator());

    @Test
    @DisplayName("이름이 비어있으면 안됨")
    void emptyNameTest() {
        String names = "asd, ,ert";
        assertThatThrownBy(() -> racingService.validateName(names))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(StringEnum.EMPTY_NAME_ERROR_MESSAGE.toString());
    }



    @Test
    @DisplayName(",와 이름 사이에 공백이 있을 경우 공백을 지우고 Car 객체 생성")
    void createCarTest() {
        String names = "aaa , bbb, ccc";
        assertThat(racingService.createCars(names).size()).isEqualTo(3);
    }

}
