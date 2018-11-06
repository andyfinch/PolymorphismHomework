package com.finch.aj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DescribeNumberTest {

    @Test
    void TestNumber_1_Decimal_A() {

        Describe describeNumber = new DescribeNumber(100.0);
        assertEquals("100.0", describeNumber.describe());

    }

    @Test
    void TestNumber_1_Decimal_B() {

        Describe describeNumber = new DescribeNumber(100.5);
        assertEquals("100.5", describeNumber.describe());

    }

    @Test
    void TestNumber_2_Decimal() {

        Describe describeNumber = new DescribeNumber(100.55);
        assertEquals("100.55", describeNumber.describe());

    }

    @Test
    void TestNumber_Zero() {

        Describe describeNumber = new DescribeNumber(0.0);
        assertEquals("0.0", describeNumber.describe());

    }

    @Test
    void TestNumber_Minus() {

        Describe describeNumber = new DescribeNumber(-100.0);
        assertEquals("-100.0", describeNumber.describe());

    }

}