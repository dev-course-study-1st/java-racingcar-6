package racingcar.view;

import java.util.Map;
import racingcar.domain.RoundResult;

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

}
