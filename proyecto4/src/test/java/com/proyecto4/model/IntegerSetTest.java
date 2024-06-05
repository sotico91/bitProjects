package com.proyecto4.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerSetTest {

    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    public void setUp() {
        set1 = new IntegerSet();
        set2 = new IntegerSet();
        set1.insertElement(1);
        set1.insertElement(2);
        set1.insertElement(3);
        set2.insertElement(3);
        set2.insertElement(4);
        set2.insertElement(5);
    }

    @Test
    public void testUnion() {
        IntegerSet resultSet = IntegerSet.union(set1, set2);
        assertTrue(resultSet.toSetString().equals("1 2 3 4 5"));
    }

    @Test
    public void testIntersection() {
        IntegerSet resultSet = IntegerSet.intersection(set1, set2);
        assertTrue(resultSet.toSetString().equals("3"));
    }

    @Test
    public void testInsertElement() {
        set1.insertElement(4);
        assertTrue(set1.toSetString().equals("1 2 3 4"));
    }

    @Test
    public void testDeleteElement() {
        set1.deleteElement(2);
        assertTrue(set1.toSetString().equals("1 3"));
    }

    @Test
    public void testToSetString() {
        assertTrue(set1.toSetString().equals("1 2 3"));
    }

    @Test
    public void testEqualTo() {
        assertTrue(set1.equalTo(set1));
        assertFalse(set1.equalTo(set2));
    }

}