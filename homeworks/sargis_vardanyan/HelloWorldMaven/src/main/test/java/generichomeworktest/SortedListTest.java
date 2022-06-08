package generichomeworktest;

import generichomework.SortedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedListTest {
    SortedList<Object> instance;

    @BeforeEach
    void beforeEachTest() {
        instance = new SortedList<>();
    }

    @Test
    void addingNullMustThrowRuntimeException() {
        assertThrows(RuntimeException.class, () -> instance.add(null));
    }

    @Test
    void containsAddedIntegerMustReturnTrue() {
        instance.add(3);
        assertTrue(instance.contains(3));
    }

    @Test
    void containsAddedStringMustReturnTrue() {
        instance.add("foo");
        assertTrue(instance.contains("foo"));
    }

    @Test
    void containsNonAddedIntegerMustReturnFalse() {
        assertFalse(instance.contains(1));
    }

    @Test
    void containsNonAddedStringMustReturnFalse() {
        assertFalse(instance.contains("foo"));
    }

    @Test
    void indexOfFirstAddedIntegerMustReturn0() {
        instance.add(1);
        assertEquals(0, instance.indexOf(1));
    }

    @Test
    void indexOfSecondAddedIntegerSmallerThenFirstMustReturn0() {
        instance.add(2);
        instance.add(1);
        assertEquals(0, instance.indexOf(1));
    }

    @Test
    void indexOfSecondAddedIntegerBiggerThenFirstMustReturn1() {
        instance.add(1);
        instance.add(2);
        assertEquals(1, instance.indexOf(2));
    }

    @Test
    void indexOfIntegerSmallerThenAllIntegersContainedMustReturn0() {
        instance.add(2);
        instance.add(3);
        instance.add(4);
        instance.add(5);
        instance.add(1);
        assertEquals(0, instance.indexOf(1));
    }

    @Test
    void unmodifiedInstanceIsEmptyMustReturnTrue() {
        assertTrue(instance.isEmpty());
    }

    @Test
    void afterAdditionIntegerIsEmptyMustReturnFalse() {
        instance.add(1);
        assertFalse(instance.isEmpty());
    }

    @Test
    void afterAddingStringIsEmptyMustReturnFalse() {
        instance.add("foo");
        assertFalse(instance.isEmpty());
    }

    @Test
    void unmodifiedInstancesSizeMustReturn0() {
        assertEquals(0, instance.size());
    }

    @Test
    void afterAddingOneIntegerSizeMustReturn1() {
        instance.add(1);
        assertEquals(1, instance.size());
    }

    @Test
    void afterAddingTwoIntegersSizeMustReturn2() {
        instance.add(1);
        instance.add(2);
        assertEquals(2, instance.size());
    }

    @Test
    void afterAddingOneStringSizeMustReturn1() {
        instance.add("foo");
        assertEquals(1, instance.size());
    }

    @Test
    void afterAddingTwoStringsSizeMustReturn2() {
        instance.add("foo");
        instance.add("bar");
        assertEquals(2, instance.size());
    }

}