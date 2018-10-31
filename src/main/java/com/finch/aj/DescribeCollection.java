package com.finch.aj;

import java.util.ArrayList;
import java.util.List;

public class DescribeCollection implements Describe {

    private List<Describe> describeList = new ArrayList<>();

    @Override
    public String describe() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; i < describeList.size(); i++) {
            stringBuilder.append(describeList.get(i).describe());
            if ( i < describeList.size()-1)
            {
                stringBuilder.append(",");
            }

        }

        stringBuilder.append("]");

        return stringBuilder.toString();

    }

    public boolean addToCollection(Describe describe)
    {
        return this.describeList.add(describe);
    }

    public List<Describe> getDescribeList() {
        return describeList;
    }

    public void setDescribeList(List<Describe> describeList) {
        this.describeList = describeList;
    }
}
