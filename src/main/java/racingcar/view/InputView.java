package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.constant.GameMessage;
import racingcar.utils.validator.InputValidator;


public class InputView {

    static InputValidator inputValidator = new InputValidator();

    public static String[] racingCarNameInput() {
        System.out.println(GameMessage.CAR_NAME_REQUEST_MESSAGE);
        return Console.readLine().split(",");
    }

    public static Integer tryCountInput() {
        System.out.println(GameMessage.TRY_COUNT_REQUEST_MESSAGE);
        String tryCount = Console.readLine();
        inputValidator.isInteger(tryCount);
        return Integer.parseInt(tryCount);
    }
}
