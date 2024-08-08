package racingcar.utils;

public class NumberValidator {

    public String validate(String input){
        if(!input.matches("^[^0]\\d*")){
            throw new IllegalArgumentException("올바른 형식의 입력이 아닙니다.");
        }
        return input;
    }
}
