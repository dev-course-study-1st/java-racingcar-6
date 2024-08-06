package racingcar.view;

import java.util.Map;
import racingcar.domain.RoundResult;
import racingcar.domain.Winner;

public class OutputView {

    private OutputView() { }

    public static void printResult(RoundResult result) {
        Map<String, Integer> value = result.value();
        StringBuilder sb = new StringBuilder();
        for (String name : value.keySet()) {
            sb.append(name).append(" : ").append("-".repeat(value.get(name))).append("\n");
        }
        System.out.println(sb);
    }

    public static void printWinner(Winner winner) {
        StringBuilder sb = new StringBuilder();
        sb.append("최종 우승자 : ");
        String winners = String.join(", ", winner.value());
        sb.append(winners);
        System.out.println(sb);
    }
}
