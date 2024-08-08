package racingcar.view;

import java.util.Map;
import racingcar.domain.RoundResult;
import racingcar.domain.Winner;

public class OutputView {

    private static final String NAME_DELIMITER = " : ";
    private static final String POSITION_BAR = "-";
    private static final String FINAL_WINNER = "최종 우승자 : ";
    private static final String COMMA = ", ";
    private static final String NEXT_LINE = "\n";

    private OutputView() { }

    public static void printResult(RoundResult result) {
        Map<String, Integer> value = result.value();
        StringBuilder sb = new StringBuilder();
        for (String name : value.keySet()) {
            sb.append(name).append(NAME_DELIMITER).append(POSITION_BAR.repeat(value.get(name))).append(NEXT_LINE);
        }
        System.out.println(sb);
    }

    public static void printWinner(Winner winner) {
        StringBuilder sb = new StringBuilder();
        sb.append(FINAL_WINNER);
        String winners = String.join(COMMA, winner.value());
        sb.append(winners);
        System.out.println(sb);
    }
}
