package com.finch.aj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DescribeTextTest {

    @Test
    void Test_Text() {

        Describe describeText = new DescribeText("describe");
        assertEquals("\"describe\"", describeText.describe());

    }

    @Test
    void Test_Text_Case() {

        Describe describeText = new DescribeText("Describe");
        assertEquals("\"Describe\"", describeText.describe());

    }

    @Test
    void Test_Text_Empty() {

        Describe describeText = new DescribeText("");
        assertEquals("\"\"", describeText.describe());

    }

    @Test
    void Test_Text_null() {

        Describe describeText = new DescribeText(null);
        assertEquals("\"null\"", describeText.describe());

    }

}