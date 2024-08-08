package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.utils.constant.GameMessage;

import java.util.List;

public class OutputView {
    public static void printRacingResultMsg() {
        System.out.println();
        System.out.println(GameMessage.RACING_RESULT_MSG.getMessage());
    }

    public static void printRacingProgress(String carName, int forwardCount) {
        System.out.println(carName + GameMessage.COLON.getMessage() + ((GameMessage.DASH).getMessage()).repeat(forwardCount));
    }

    public static void printCurrentPositions(Cars cars) {
        cars.getCars().forEach(car -> printRacingProgress(car.getName(), car.getPosition()));
        System.out.println();
    }

    private static String buildWinnerNames(List<Car> winners) {
        StringBuilder winnerNames = new StringBuilder();
        winnerNames.append(GameMessage.DEFAULT_WINNER_MESSAGE.getMessage());
        if (winners.size() == 1) {
            winnerNames.append(winners.get(0).getName());
        }
        if (winners.size() != 1) {
            for (int i = 0; i < winners.size(); i++) {
                winnerNames.append(winners.get(i).getName());
                if (i != winners.size() - 1) {
                    winnerNames.append(GameMessage.COMMA.getMessage());
                }
            }
        }
        return winnerNames.toString();
    }

    public static void printWinners(List<Car> winners) {
        String winnerNames = buildWinnerNames(winners);
        System.out.println(winnerNames);
    }


}
