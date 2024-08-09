package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.domain.CarGarage;

public class CarGarageTest {

    private Car car1;
    private Car car2;
    private Car car3;
    private CarGarage carGarage;

    @BeforeEach
    public void setUp() {
        car1 = mock(Car.class);
        car2 = mock(Car.class);
        car3 = mock(Car.class);

        when(car1.getName()).thenReturn("Car1");
        when(car2.getName()).thenReturn("Car2");
        when(car3.getName()).thenReturn("Car3");

        carGarage = new CarGarage(List.of(car1, car2, car3));
    }

    @Test
    public void testCalculateMaxPosition() {
        when(car1.getPosition()).thenReturn(1);
        when(car2.getPosition()).thenReturn(3);
        when(car3.getPosition()).thenReturn(2);

        int maxPosition = carGarage.calculateMaxPosition();
        assertEquals(3, maxPosition);
    }

    @Test
    public void testGetCarsOnMaxPosition() {
        when(car1.getPosition()).thenReturn(2);
        when(car2.getPosition()).thenReturn(2);
        when(car3.getPosition()).thenReturn(1);

        List<String> carsOnMaxPosition = carGarage.getCarsOnMaxPosition(2);
        assertTrue(carsOnMaxPosition.contains("Car1"));
        assertTrue(carsOnMaxPosition.contains("Car2"));
        assertEquals(2, carsOnMaxPosition.size());
    }

    @Test
    public void testGetCarsOnMaxPosition_NoCarsAtMaxPosition() {
        when(car1.getPosition()).thenReturn(1);
        when(car2.getPosition()).thenReturn(1);
        when(car3.getPosition()).thenReturn(1);

        List<String> carsOnMaxPosition = carGarage.getCarsOnMaxPosition(2);
        assertTrue(carsOnMaxPosition.isEmpty());
    }
}
