import Mathemator.Mathemator;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MathematorTest {

    //given
    private Mathemator mathemator;

    @BeforeEach
    public void setUp() throws Exception{
        mathemator = new Mathemator();
    }

    @org.junit.jupiter.api.Test
    public void substract() {
        //when
        long expected = 10 - 23 - (-1) - 16;

        //then
        assertEquals(expected, mathemator.substract(10, 23, -1, 16));

        expected = 102 - 110;
        assertEquals(expected, mathemator.substract(102, 110));

        expected = 0;
        assertEquals(expected, mathemator.substract(0, 0, 0));
    }

    @org.junit.jupiter.api.Test
    public void add() {
       //when
       long expected = 10 + 23 + (-1) + 16;

       //then
        assertEquals(expected, mathemator.add(10, 23, -1, 16));

        expected = 102 + 110;
        assertEquals(expected, mathemator.add(102, 110));

        expected = 0;
        assertEquals(expected, mathemator.add(0, 0, 0));

    }
}