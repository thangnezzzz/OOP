import junit.framework.TestCase;

public class TestPace extends TestCase {
    public void testPace() {
        Entry entry = new Entry(new Date(5, 6, 2004), 5.3, 27, "good");
        assertEquals(5.094, entry.pace(), 0.001);

        entry = new Entry(new Date(6, 6, 2004), 2.8, 24, "tired");
        assertEquals(8.571, entry.pace(), 0.001);

        entry = new Entry(new Date(23, 6, 2004), 26.2, 259, "exhausted");
        assertEquals(9.885, entry.pace(), 0.001);
    }
}