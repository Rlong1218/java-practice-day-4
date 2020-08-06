import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XYZThereTest {

    @Test
    void xyzThere() {
        assertTrue(XYZThere.xyzThere("xyz"));
        assertTrue(XYZThere.xyzThere(".xyzxyz"));
        assertTrue(XYZThere.xyzThere("xxyz"));
        assertTrue(XYZThere.xyzThere("xyoopsxyz"));
        assertFalse(XYZThere.xyzThere(".xyz"));
        assertFalse(XYZThere.xyzThere("noneofthathere"));
        assertFalse(XYZThere.xyzThere("xy.xyz"));
    }
}