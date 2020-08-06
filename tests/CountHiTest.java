import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountHiTest {

    @Test
    void countHi() {
        assertEquals(3, CountHi.countHi("hihihi"));
        assertEquals(2, CountHi.countHi("hihiHi"));
        assertEquals(0, CountHi.countHi("noneofthathere"));
        assertEquals(2, CountHi.countHi("hi hello hi"));
        assertEquals(0, CountHi.countHi(""));
    }
}