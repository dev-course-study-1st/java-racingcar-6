package racingcar.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import racingcar.utils.enums.GameNumber;
import racingcar.utils.generator.FixedNumberGenerator;
import racingcar.utils.generator.NumberGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CarsTest {
    private Car car1;
    private Car car2;
    private Car car3;
    private Cars cars;

    @BeforeEach
    void setUp() {
        car1 = new Car(new Name("조믿음"), new Position(GameNumber.START_POSITION.getNumber()));
        car2 = new Car(new Name("이철수"), new Position(GameNumber.START_POSITION.getNumber()));
        car3 = new Car(new Name("김영희"), new Position(GameNumber.START_POSITION.getNumber()));

        List<Car> carList = Arrays.asList(car1, car2, car3);
        cars = new Cars(carList);
    }

    @DisplayName("리스트 반환 테스트")
    @Test
    public void checkList(){
        List<Car> carList = cars.getCarList();
        assertEquals(List.of(car1, car2, car3), carList);
    }

    @DisplayName("차 이름 리스트 반환 테스트")
    @Test
    public void checkNameList(){
        List<String> nameList = cars.carToString();
        assertEquals(List.of("조믿음", "이철수", "김영희"), nameList);
    }

    @DisplayName("차 위치 맵 반환 테스트")
    @Test
    public void checkMap(){
        Map<String, Integer> result = cars.carToMap();
        assertEquals(3, result.size());
        assertEquals(GameNumber.START_POSITION.getNumber(),result.get("조믿음"));
        assertEquals(GameNumber.START_POSITION.getNumber(),result.get("이철수"));
        assertEquals(GameNumber.START_POSITION.getNumber(),result.get("김영희"));
    }

    @DisplayName("4미만 정지 후 맵 반환 테스트")
    @Test
    public void checkStop(){
        cars.moveCars(new FixedNumberGenerator(3));
        Map<String, Integer> result = cars.carToMap();
        assertEquals(GameNumber.START_POSITION.getNumber(),result.get("조믿음"));
        assertEquals(GameNumber.START_POSITION.getNumber(),result.get("이철수"));
        assertEquals(GameNumber.START_POSITION.getNumber(), result.get("김영희"));
    }

    @DisplayName("4이상 이동 후 맵 반환 테스트")
    @Test
    public void checkMove(){
        cars.moveCars(new FixedNumberGenerator(5));
        Map<String, Integer> result = cars.carToMap();
        assertEquals(GameNumber.START_POSITION.getNumber()+1,result.get("조믿음"));
        assertEquals(GameNumber.START_POSITION.getNumber()+1,result.get("이철수"));
        assertEquals(GameNumber.START_POSITION.getNumber()+1, result.get("김영희"));

    }
}