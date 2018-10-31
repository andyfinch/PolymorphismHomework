package com.finch.aj;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DescribeCollectionTest {

    @Test
    void TestDescribeCollection_A() {

        DescribeCollection describeCollection = new DescribeCollection();
        Describe describeText = new DescribeText("describe");
        Describe describeNumber = new DescribeNumber(100.50);
        Describe describeBoolean = new DescribeBoolean(true);
        Describe describeNull = new DescribeNull();
        describeCollection.getDescribeList().add(describeText);
        describeCollection.getDescribeList().add(describeNumber);
        describeCollection.getDescribeList().add(describeBoolean);
        describeCollection.getDescribeList().add(describeNull);
        assertEquals("[\"describe\",100.5,true,null]", describeCollection.describe());

    }

    @Test
    void TestDescribeCollection_B() {

        DescribeCollection describeCollection = new DescribeCollection();
        Describe describeText1 = new DescribeText("describe");
        Describe describeText2 = new DescribeText("hello");
        Describe describeBoolean1 = new DescribeBoolean(true);
        Describe describeBoolean2 = new DescribeBoolean(false);
        describeCollection.getDescribeList().add(describeText1);
        describeCollection.getDescribeList().add(describeText2);
        describeCollection.getDescribeList().add(describeBoolean1);
        describeCollection.getDescribeList().add(describeBoolean2);
        assertEquals("[\"describe\",\"hello\",true,false]", describeCollection.describe());

    }

    @Test
    void TestDescribeCollection_NullList() {

        DescribeCollection describeCollection = new DescribeCollection();
        assertEquals("[]", describeCollection.describe());

    }
}