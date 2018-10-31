package com.finch.aj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DescribeNullTest {

    @Test
    void TestBooleanTrue() {

        Describe describeNull = new DescribeNull();
        assertEquals("null", describeNull.describe());

    }

}