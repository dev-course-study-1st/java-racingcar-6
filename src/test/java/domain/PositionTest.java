package domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Position;
import racingcar.util.Const;

public class PositionTest {

    @BeforeEach
    public void setUp() {
        Const START_POSITION = mock(Const.class);
        when(START_POSITION.getValue()).thenReturn(0);
    }

    @Test
    public void testPositionCreation() {
        Position position = new Position();
        assertEquals(0, position.getValue());
    }

    @Test
    public void testGoForward() {
        Position position = new Position();
        position.goForward();
        assertEquals(1, position.getValue());

        position.goForward();
        assertEquals(2, position.getValue());
    }

    @Test
    public void testGetValue() {
        Position position = new Position();
        assertEquals(0, position.getValue());

        position.goForward();
        assertEquals(1, position.getValue());
    }
}
