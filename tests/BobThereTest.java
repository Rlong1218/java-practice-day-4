import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BobThereTest {

    @Test
    void bobThere() {
        assertTrue(BobThere.bobThere("asdfbobadsf"));
        assertFalse(BobThere.bobThere("asdfioan"));
        assertTrue(BobThere.bobThere("alfbabasdf"));
        assertTrue(BobThere.bobThere("sadfbibas"));
        assertFalse(BobThere.bobThere(""));
    }
}