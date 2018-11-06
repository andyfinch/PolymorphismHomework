package com.finch.aj;

/**
 * Describe implementation class to return a boolean String
 */
public class DescribeBoolean implements Describe {

    private Boolean descibeBoolean;

    public DescribeBoolean(Boolean descibeBoolean) {
        this.descibeBoolean = descibeBoolean;
    }

    /**
     * Parses describeBoolean to either "true" or "false"
     * @return The String representation of describeBoolean
     */
    public String describe() {
        return descibeBoolean.toString().toLowerCase();
    }
}
