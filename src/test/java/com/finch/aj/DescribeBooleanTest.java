package com.finch.aj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescribeBooleanTest {

    @Test
    void TestBooleanTrue() {

        Describe describeBoolean = new DescribeBoolean(true);
        assertEquals("true", describeBoolean.describe());

    }

    @Test
    void TestBooleanFalse() {

        Describe describeBoolean = new DescribeBoolean(false);
        assertEquals("false", describeBoolean.describe());

    }

}