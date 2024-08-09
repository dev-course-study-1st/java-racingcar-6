package racingcar;

import java.util.List;
import racingcar.controller.RaceController;
import racingcar.service.RaceService;
import racingcar.util.converter.ConverterHolder;
import racingcar.util.converter.StringToCarGarageConverter;
import racingcar.util.converter.StringToTryCountConverter;
import racingcar.util.generator.NumberGenerator;
import racingcar.util.generator.RandomNumberGenerator;

public class AppConfig {

    public RaceController setSystem() {
        setConverters();
        return new RaceController(raceService());
    }

    public RaceService raceService() {
        return new RaceService(onServiceNumberGenerator());
    }

    public NumberGenerator onServiceNumberGenerator() {
        return new RandomNumberGenerator();
    }

    private void setConverters() {
        ConverterHolder.setConverters(List.of(
                new StringToCarGarageConverter(),
                new StringToTryCountConverter()
        ));
    }

    public void clear() {
        ConverterHolder.clearHolder();
    }
}
