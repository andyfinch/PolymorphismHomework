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
        Iterator<String>iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try {
            processor.process(iterator);
        } catch (IOException e) {
            fail("shouldn't get here");
        }

        assertEquals("[\"Test\"]", processor.describe());
    }

    @Test
    void TestProcessorImpl_Simple_Number() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add("100.55");
        Iterator<String> iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try {
            processor.process(iterator);
        } catch (IOException e) {
            fail("shouldn't get here");
        }

        assertEquals("[100.55]", processor.describe());
    }

    @Test
    void TestProcessorImpl_Simple_Boolean() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add("true");
        Iterator<String> iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try {
            processor.process(iterator);
        } catch (IOException e) {
            fail("shouldn't get here");
        }

        assertEquals("[true]", processor.describe());
    }

    @Test
    void TestProcessorImpl_Simple_Null() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add(null);
        Iterator<String> iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try {
            processor.process(iterator);
        } catch (IOException e) {
            fail("shouldn't get here");
        }

        assertEquals("[null]", processor.describe());
    }

    @Test
    void TestProcessorImpl_Multi_Types() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add("\"Test\"");
        listToTest.add("100.55");
        listToTest.add("true");
        listToTest.add(null);
        Iterator<String> iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try
        {
            processor.process(iterator);
        } catch (IOException e)
        {
            fail("shouldn't get here");
        }

        assertEquals("[\"Test\",100.55,true,null]", processor.describe());
    }

    @Test
    void TestProcessorImpl_Invalid_Type() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add("wrong");
        Iterator<String> iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try {
            processor.process(iterator);
            fail("shouldn't get here");
        } catch (IOException e) {
            assertEquals("Not a valid type wrong", e.getMessage());
        }


    }

    @Test
    void TestProcessorImpl_Check_Classe_Type_Number() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add("100.55");
        Iterator<String> iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try
        {
            processor.process(iterator);
        } catch (IOException e)
        {
            fail("shouldn't get here");
        }

        assertTrue(processor.getDescribeCollection().getDescribeList().get(0) instanceof DescribeNumber);
    }

    @Test
    void TestProcessorImpl_Check_Classe_Type_Boolean() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add("true");
        Iterator<String> iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try
        {
            processor.process(iterator);
        } catch (IOException e)
        {
            fail("shouldn't get here");
        }

        assertTrue(processor.getDescribeCollection().getDescribeList().get(0) instanceof DescribeBoolean);
    }

    @Test
    void TestProcessorImpl_Check_Classe_Type_Text() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add("\"Test\"");
        Iterator<String> iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try
        {
            processor.process(iterator);
        } catch (IOException e)
        {
            fail("shouldn't get here");
        }

        assertTrue(processor.getDescribeCollection().getDescribeList().get(0) instanceof DescribeText);
    }

    @Test
    void TestProcessorImpl_Check_Classe_Type_Null() {

        List<String> listToTest = new ArrayList<>();
        listToTest.add(null);
        Iterator<String> iterator = listToTest.iterator();
        ProcessorImpl processor = new ProcessorImpl();

        try
        {
            processor.process(iterator);
        } catch (IOException e)
        {
            fail("shouldn't get here");
        }

        assertTrue(processor.getDescribeCollection().getDescribeList().get(0) instanceof DescribeNull);
    }

    @Test
    void TestProcessorImpl_Stub_Text() {

       
        ProcessorImpl processor = new ProcessorImpl();

        try
        {
            processor.process(new StubIterator("\"Test\""));
        } catch (IOException e)
        {
            fail("shouldn't get here");
        }

        assertEquals("[\"Test\"]", processor.describe());
    }

    @Test
    void TestProcessorImpl_Stub_Boolean() {


        ProcessorImpl processor = new ProcessorImpl();

        try
        {
            processor.process(new StubIterator("true"));
        } catch (IOException e)
        {
            fail("shouldn't get here");
        }

        assertEquals("[true]", processor.describe());
    }
}