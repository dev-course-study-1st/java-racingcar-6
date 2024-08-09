package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("TestCar");
    }

    @Test
    public void testCarCreation() {
        assertEquals("TestCar", car.getName());
        assertEquals(0, car.getPosition());
    }

    @Test
    public void testMoveOrStay_Move() {
        car.moveOrStay(5);
        assertEquals(1, car.getPosition());
    }

    @Test
    public void testMoveOrStay_Stay() {
        car.moveOrStay(3);
        assertEquals(0, car.getPosition());
    }

    @Test
    public void testGetName() {
        assertEquals("TestCar", car.getName());
    }

    @Test
    public void testGetPosition() {
        assertEquals(0, car.getPosition());
        car.moveOrStay(5);
        assertEquals(1, car.getPosition());
    }
}
