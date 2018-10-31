package com.finch.aj;

public class DescribeNumber implements Describe {

    private Double describeNumber;

    public DescribeNumber(Double describeNumber) {
        this.describeNumber = describeNumber;
    }

    public String describe() {
        return describeNumber.toString();
    }
}
