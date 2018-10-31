package com.finch.aj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DescribeTextTest {

    @Test
    void TestBooleanTrue() {

        Describe describeText = new DescribeText("describe");
        assertEquals("\"describe\"", describeText.describe());

    }

}