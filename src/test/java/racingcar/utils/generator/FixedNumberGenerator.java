package racingcar.utils.generator;

public class FixedNumberGenerator implements NumberGenerator {

    private int num;

    public FixedNumberGenerator(int num) {
        this.num = num;
    }

    @Override
    public int generate() {
        return num;
    }

}
