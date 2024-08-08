package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.NameValidator;
import racingcar.utils.NumberValidator;

public class InputView {
    private final NameValidator nameValidator;
    private final NumberValidator numberValidator;

    public InputView(NameValidator nameValidator, NumberValidator numberValidator) {
        this.nameValidator = nameValidator;
        this.numberValidator = numberValidator;
    }

    public String[] getNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        return nameValidator.validate(input);
    }

    public String getNumber() {
        System.out.println("시도할 회수는 몇회인가요?");
        String input = Console.readLine();
        return numberValidator.validate(input);
    }
}
