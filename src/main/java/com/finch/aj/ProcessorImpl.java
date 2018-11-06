package com.finch.aj;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * Implementation of Processor to process Iterator and create Describe Objects
 * and store in a collection
 */
public class ProcessorImpl implements Processor, Describe {

    private DescribeCollection describeCollection = new DescribeCollection();

    /**
     * Process Iterator by testing each String to determine the type and create
     * DescribeNull, DescribeText, DescribeNumber or DescribeBoolean accordingly. Each object
     * then added to the DescrobeCollection List
     * @param stringIterator   The Iterator to process
     * @throws IOException  IOException if String does not parse to any type
     */
    @Override
    public void process(Iterator<String> stringIterator) throws IOException {


        while (stringIterator.hasNext()) {
            String s =  stringIterator.next();

            if ( s == null)
            {
                describeCollection.addToCollection(new DescribeNull());
            }
            else if ( s.startsWith("\"") && s.endsWith("\""))
            {
                String describeString = s.replace("\"", "");
                describeCollection.addToCollection(new DescribeText(describeString));
            }
            else if ( isNumeric(s))
            {
                Double doubleToAdd = Double.valueOf(s);
                describeCollection.addToCollection(new DescribeNumber(doubleToAdd));

            }
            else if ( isBoolean(s))
            {
                Boolean booleanToAdd = Boolean.parseBoolean(s);
                describeCollection.addToCollection(new DescribeBoolean(booleanToAdd));
            }
            else
            {
                throw new IOException("Not a valid type " + s);
            }
        }

    }

    /**
     * Run the describeCollection.describe method to return a concatenated String
     * @return concatenated String
     */
    public String describe()
    {
        return describeCollection.describe();
    }

    /**
     * Helper to test if String is numeric
     * @param stringToTest  String to test if numeric
     * @return boolean to indicate if String is numeric
     */
    private boolean isNumeric(String stringToTest)
    {
        try {
            Double.parseDouble(stringToTest);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    /**
     * Helper to test if string is a boolean
     * @param stringToTest  String to test of boolean
     * @return boolean to inddicate of String is boolean
     */
    private boolean isBoolean(String stringToTest)
    {
        if ( "true".equalsIgnoreCase(stringToTest) || "false".equalsIgnoreCase(stringToTest))
        {
            return true;
        }

        return false;
    }

    /**
     * Getter for DescribeCollection
     * @return describeCollection
     */
    public DescribeCollection getDescribeCollection() {
        return describeCollection;
    }

    
}
