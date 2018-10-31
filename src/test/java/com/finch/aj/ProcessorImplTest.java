package com.finch.aj;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProcessorImplTest {

    @Test
    void TestProcessorImpl_Simple_String() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add("\"Test\"");
        Iterator iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try {
            processor.process(iterator);
        } catch (IOException e) {
            fail("shouldn't get here");
        }

        assertEquals("[\"Test\"]", processor.getDescribeCollection().describe());
    }

    @Test
    void TestProcessorImpl_Simple_Number() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add("100.55");
        Iterator iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try {
            processor.process(iterator);
        } catch (IOException e) {
            fail("shouldn't get here");
        }

        assertEquals("[100.55]", processor.getDescribeCollection().describe());
    }

    @Test
    void TestProcessorImpl_Simple_Boolean() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add("true");
        Iterator iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try {
            processor.process(iterator);
        } catch (IOException e) {
            fail("shouldn't get here");
        }

        assertEquals("[true]", processor.getDescribeCollection().describe());
    }

    @Test
    void TestProcessorImpl_Simple_Null() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add(null);
        Iterator iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try {
            processor.process(iterator);
        } catch (IOException e) {
            fail("shouldn't get here");
        }

        assertEquals("[null]", processor.getDescribeCollection().describe());
    }

    @Test
    void TestProcessorImpl_Invalid_Type() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add("wrong");
        Iterator iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try {
            processor.process(iterator);
            fail("shouldn't get here");
        } catch (IOException e) {
            assertEquals("Not a valid type wrong", e.getMessage());
        }


    }
}