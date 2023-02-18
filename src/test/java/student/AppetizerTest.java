package student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppetizerTest {

    private static final Appetizer MIXED_FRUIT = new Appetizer("Mixed Fruit", 215);
    private static final Appetizer FRENCH_FRIES = new Appetizer("French Fries", 275);
    private static final Appetizer SIDE_SALAD = new Appetizer("Side Salad", 335);
    private static final Appetizer HOT_WINGS = new Appetizer("Hot Wings", 355);
    private static final Appetizer MOZZARELLA_STICKS = new Appetizer("Mozzarella Sticks", 420);
    private static final Appetizer SAMPLER_PLATE = new Appetizer("Sampler Plate", 580);
    private static final Appetizer SAMPLER_PLATE2 = new Appetizer("Sampler Plate", 580);
    private static final Appetizer NULL_APPETIZER = new Appetizer(null, 0);
    private static final Appetizer EMPTY_STRING = new Appetizer("", 0);

    @Test
    public void testToString() {
        assertEquals("Mixed Fruit ($2.15)", MIXED_FRUIT.toString());
        assertNotEquals("mixed fruit ($2.15)", MIXED_FRUIT.toString());
        assertEquals("null ($0.00)", NULL_APPETIZER.toString());
        assertNotEquals("null ($0)", NULL_APPETIZER.toString());
        assertEquals(" ($0.00)", EMPTY_STRING.toString());
    }

    @Test
    public void testEquals() {
        assertTrue(SAMPLER_PLATE.equals(SAMPLER_PLATE2));
        assertFalse((new Appetizer("Sampler Plate", 100)).equals(SAMPLER_PLATE2));
        assertFalse((new Appetizer("sampler plate", 580)).equals(SAMPLER_PLATE2));
        assertFalse((new Appetizer("sampler plate", 100)).equals(SAMPLER_PLATE2));
    }

    @Test
    public void compareTo() {
        assertEquals(-1, FRENCH_FRIES.compareTo(SIDE_SALAD));
        assertEquals(0, SAMPLER_PLATE.compareTo(SAMPLER_PLATE2));
        assertEquals(1, MOZZARELLA_STICKS.compareTo(HOT_WINGS));
        assertEquals(-1, (new Appetizer("Sampler Plate", 100)).compareTo(SAMPLER_PLATE2));
        assertEquals(1, (new Appetizer("Sampler Plate", 600)).compareTo(SAMPLER_PLATE2));
        assertEquals(-1, MIXED_FRUIT.compareTo(MOZZARELLA_STICKS));
        assertEquals(1, SIDE_SALAD.compareTo(SAMPLER_PLATE));
    }
}