package com.finch.aj;

/**
 * Describe implementation class to return a number String
 */
public class DescribeNumber implements Describe {

    private Double describeNumber;

    public DescribeNumber(Double describeNumber) {
        this.describeNumber = describeNumber;
    }

    /**
     * Parses the describeNumber to String retaining the original decimal places
     * @return The String representation of the describeNumber
     */
    public String describe() {
        return describeNumber.toString();
    }
}
