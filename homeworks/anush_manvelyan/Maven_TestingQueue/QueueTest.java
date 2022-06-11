import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    private Queue<Integer> queue;

    @BeforeEach
    public void setUp() {
        this.queue = new Queue<>();
    }

    @Test
    public void testIsEmptyForQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testSizeIncrementsWhenAddingElements() {
        queue.add(123);
        assertEquals(1, queue.getSize());

        queue.add(456);
        assertEquals(2, queue.getSize());
    }

    @Test
    public void testSizeDecrementsWhenRemovingElements() {
        queue.add(789);
        queue.remove();
        assertTrue(queue.isEmpty());
    }
}

