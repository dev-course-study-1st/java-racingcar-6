package racingcar.util.valid;

public interface Validator<T> {

     T validate(T value);

     //가독성을 위한 검증 종료 메서드
     default void finish() {}
}
