package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.InputValidator;
import racingcar.utils.constant.GameMessage;


public class InputView {


    public static String[] racingCarNameInput() {
        System.out.println(GameMessage.CAR_NAME_REQUEST_MESSAGE.getMessage());
        String carNameInput = Console.readLine();
        InputValidator.isCarNameInput(carNameInput);
        return carNameInput.split(",");
    }

    public static Integer tryCountInput() {
        System.out.println(GameMessage.TRY_COUNT_REQUEST_MESSAGE.getMessage());
        String tryCount = Console.readLine();
        InputValidator.isInteger(tryCount);
        return Integer.parseInt(tryCount);
    }
}
