package com.finch.aj;

import java.io.IOException;

public class ProcessorImpl implements Processor, Describe {

    private DescribeCollection describeCollection = new DescribeCollection();

    @Override
    public void process(Iterable<String> it) throws IOException {



        for (String s : it) {

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

    public String describe()
    {
        return describeCollection.describe();
    }

    private boolean isNumeric(String stringToTest)
    {
        try {
            Double.parseDouble(stringToTest);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    private boolean isBoolean(String stringToTest)
    {
        if ( "true".equalsIgnoreCase(stringToTest) || "false".equalsIgnoreCase(stringToTest))
        {
            return true;
        }

        return false;
    }

    public DescribeCollection getDescribeCollection() {
        return describeCollection;
    }

    public void setDescribeCollection(DescribeCollection describeCollection) {
        this.describeCollection = describeCollection;
    }
}
