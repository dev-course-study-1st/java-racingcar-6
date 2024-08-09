package racingcar.view;

import racingcar.model.RoundStatus;
import racingcar.model.Winners;
import racingcar.utils.enums.GameMessage;

import java.util.List;
import java.util.Map;

public class OutputView {

    public void printRaceResult() {
        System.out.println(GameMessage.OUTPUT_ROUND_STATUS);
    }

    public void printRaceStatus(RoundStatus roundStatus) {
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> status = roundStatus.getStatus();
        for (String name : status.keySet()) {
            int distance = status.get(name);
            sb.append(createRaceEntry(name, distance) + "\n");
        }
        System.out.println(sb.toString());
    }

    private String createRaceEntry(String name, int distance){
        StringBuilder sb = new StringBuilder();
        sb.append(name + " : ");
        for (int i = 0; i < distance; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

    public void printWinners(Winners winners) {
        StringBuilder sb = new StringBuilder();
        List<String> winnerNames = winners.getWinners();
        sb.append(GameMessage.OUTPUT_WINNERS);
        sb.append(String.join(", ", winnerNames));
        System.out.println(sb.toString());
    }

}
