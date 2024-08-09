package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.util.constant.StringEnum;

public class InputView {

    public static String printInputName() {
        System.out.println(StringEnum.PRINT_NAME);
        return Console.readLine();
    }

    public static String printInputRound() {
        System.out.println(StringEnum.PRINT_COUNT);
        return Console.readLine();
    }
}
