package com.finch.aj;

/**
 * Describe implementation class to return a text String
 */
public class DescribeText implements Describe {

    private String describeString;

    public DescribeText(String describeString) {
        this.describeString = describeString;
    }

    /**
     * Parses the describeString by adding " at the beginning and end"
     * @return The String representation of the describeString with appended with " at the start and end
     */
    public String describe() {
        return "\"" + describeString + "\"";
    }
}
