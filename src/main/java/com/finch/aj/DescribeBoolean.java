package com.finch.aj;

public class DescribeBoolean implements Describe {

    private Boolean descibeBoolean;

    public DescribeBoolean(Boolean descibeBoolean) {
        this.descibeBoolean = descibeBoolean;
    }

    public String describe() {
        return descibeBoolean.toString().toLowerCase();
    }
}
