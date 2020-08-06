import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XYBalanceTest {

    @Test
    void xyBalance() {
        assertTrue(XYBalance.xyBalance("xxxxxxxy"));
        assertTrue(XYBalance.xyBalance("xyoopsxyy"));
        assertTrue(XYBalance.xyBalance("noneofthathere"));
        assertTrue(XYBalance.xyBalance("y"));
        assertFalse(XYBalance.xyBalance("x"));
        assertFalse(XYBalance.xyBalance("xyyyx"));
    }
}