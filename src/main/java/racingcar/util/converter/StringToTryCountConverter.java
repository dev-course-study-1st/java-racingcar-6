package racingcar.util.converter;

import racingcar.domain.TryCount;

public class StringToTryCountConverter implements Converter<String, TryCount> {

    @Override
    public boolean supports(Object from, Class<?> to) {
        return from.getClass() == String.class && to == TryCount.class;
    }

    @Override
    public TryCount convert(String source) {
        checkInput(source);
        int count = toInt(source);
        return new TryCount(count);
    }

    private void checkInput(String source) {
        if (source.equals(" ")) {
            throw new IllegalArgumentException("숫자를 입력해 주세요.");
        }
    }

    private int toInt(String source) {
        try {
            return Integer.parseInt(source);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자만 입력 가능합니다.");
        }
    }
}
