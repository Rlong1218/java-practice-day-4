import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatDogTest {

    @Test
    void catDog() {
        assertTrue(CatDog.catDog("catcatdogdog"));
        assertTrue(CatDog.catDog("abcatdogasdf"));
        assertTrue(CatDog.catDog("dogcatcatdog"));
        assertTrue(CatDog.catDog("noneofthosehere"));
        assertFalse(CatDog.catDog("catcatcat"));
        assertFalse(CatDog.catDog("dog"));
        assertFalse(CatDog.catDog("catcatdog"));
    }
}