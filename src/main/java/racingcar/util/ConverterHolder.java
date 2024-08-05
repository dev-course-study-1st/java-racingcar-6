package racingcar.util;

import java.util.ArrayList;
import java.util.List;

public class ConverterHolder {
    private static List<Converter> converterHolder = new ArrayList<>();

    public static void setConverters(List<Converter> converters) {
        converterHolder.addAll(converters);
    }

    public static <T extends Object> T convert(Object target, Class convertTo) {
        for (Converter converter : converterHolder) {
            if (converter.supports(target, convertTo)) {
                return (T) converter.convert(target);
            }
        }
        throw new IllegalArgumentException("잘못된 입력 및 반환 형식입니다.");
    }

    public static void clearHolder() {
        converterHolder.clear();
    }
}
