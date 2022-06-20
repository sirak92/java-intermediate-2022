import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack = new Stack(5);

    @BeforeEach
    public void setup() {
        stack.push(4);
        stack.push(2);
    }

    @Test
    public void pushTest() {
        stack.push(6);
        assertEquals(3, stack.size());
        assertEquals(6, stack.pop());
    }

    @Test
    public void popTest() {
        assertEquals(2, stack.pop());
    }

    @Test
    public void sizeTest() {
        assertEquals(2, stack.size());
    }

    @Test
    public void peekTest() {
        assertEquals(2, stack.peek());
    }

    @Test
    public void isFullTest() {
        stack.push(5);
        stack.push(5);
        stack.push(5);
        assertTrue(stack.isFull());
        stack.pop();
        assertFalse(stack.isFull());
    }

    @Test
    public void isEmptyTest() {
        stack.push(5);
        stack.push(5);
        stack.push(5);
        assertFalse(stack.isEmpty());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}
