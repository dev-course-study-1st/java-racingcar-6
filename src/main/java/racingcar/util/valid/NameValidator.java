package racingcar.util.valid;

import racingcar.util.constant.NumberEnum;
import racingcar.util.constant.StringEnum;

import java.util.Arrays;

public class NameValidator implements Validator<String>{
    @Override
    public String validate(String value) {
        for (String name : value.split(StringEnum.COMMA.toString())) {
            if (name.length() > NumberEnum.FIVE.getNumber()) {
                throw new IllegalArgumentException("이름의 길이가 6자 이상입니다.");
            }
        }

        return value;
    }
}
