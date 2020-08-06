import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MixStringTest {

    @Test
    void mixString() {
        assertEquals("HTihere", MixString.mixString("Hi", "There"));
        assertEquals("Hxexllo", MixString.mixString("Hello", "xx"));
        assertEquals("", MixString.mixString("", ""));
        assertEquals("hello", MixString.mixString("hello", ""));
        assertEquals("There", MixString.mixString("", "There"));
    }
}