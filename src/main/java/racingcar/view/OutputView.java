package racingcar.view;

import racingcar.utils.constant.GameMessage;

public class OutputView {
    public static void printRacingResultMsg() {
        System.out.println(GameMessage.RACING_RESULT_MSG);
    }

    public static void printRacingProgress(String carName, int forwardCount) {
        System.out.println(carName + GameMessage.COLON + ((GameMessage.DASH).getMessage()).repeat(forwardCount));
    }
}
