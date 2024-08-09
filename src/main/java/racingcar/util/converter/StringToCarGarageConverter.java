package racingcar.util.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import racingcar.domain.Car;
import racingcar.domain.CarGarage;

public class StringToCarGarageConverter implements Converter<String, CarGarage> {

    private static final String REGEX = "^[a-zA-Z,]*$";

    @Override
    public boolean supports(Object from, Class<?> to) {
        return from.getClass() == String.class && to == CarGarage.class;
    }

    @Override
    public CarGarage convert(String source) {
        validateInput(source);
        String[] split = source.split(",");
        List<Car> cars = new ArrayList<>();
        for (String name : split) {
            validateName(name);
            cars.add(new Car(name));
        }

        return new CarGarage(cars);
    }

    private void validateInput(String source) {
        if (source.contains(" ")) {
            throw new IllegalArgumentException("이름에 공백은 허용하지 않습니다.");
        }

        Matcher matcher = Pattern.compile(REGEX).matcher(source);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("문자와 쉼표(,)만 입력 해주세요.");
        }
    }

    private void validateName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("이름의 길이는 5글자 이하만 가능합니다.");
        }
    }
}
