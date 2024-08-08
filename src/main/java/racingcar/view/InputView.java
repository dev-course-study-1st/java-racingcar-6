package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.CarGarage;
import racingcar.domain.TryCount;
import racingcar.util.converter.ConverterHolder;

public class InputView {

    private static final String INPUT_CARS_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_TRY_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";

    private InputView() { }

    public static CarGarage inputCars() {
        System.out.println(INPUT_CARS_MESSAGE);
        String input = Console.readLine();
        return ConverterHolder.convert(input, CarGarage.class);
    }

    public static TryCount inputCount() {
        System.out.println(INPUT_TRY_COUNT_MESSAGE);
        String input = Console.readLine();
        return ConverterHolder.convert(input, TryCount.class);
    }
}
