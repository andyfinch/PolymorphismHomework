package com.finch.aj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DescribeNumberTest {

    @Test
    void TestBooleanTrue() {

        Describe describeNumber = new DescribeNumber(100.50);
        assertEquals("100.5", describeNumber.describe());

    }

}