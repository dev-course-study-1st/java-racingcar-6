package racingcar;

import java.util.List;
import racingcar.controller.RaceController;
import racingcar.util.ConverterHolder;
import racingcar.util.StringToCarGarageConverter;
import racingcar.util.StringToTryCountConverter;

public class AppConfig {

    public RaceController setSystem() {
        setConverters();
        return new RaceController();
    }

    private void setConverters() {
        ConverterHolder.setConverters(List.of(
                new StringToCarGarageConverter(),
                new StringToTryCountConverter()
        ));
    }

}
