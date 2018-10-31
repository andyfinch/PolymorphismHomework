package com.finch.aj;

public class DescribeText implements Describe {

    private String describeString;

    public DescribeText(String describeString) {
        this.describeString = describeString;
    }

    public String describe() {
        return "\"" + describeString + "\"";
    }
}
