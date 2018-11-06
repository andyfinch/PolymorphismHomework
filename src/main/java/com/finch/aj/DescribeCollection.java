package com.finch.aj;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to hold a collection of Describe objects and generate a concatenated String of Describe Strings
 */
public class DescribeCollection implements Describe {

    private List<Describe> describeList = new ArrayList<>();

    /**
     * Loop through List of Describe objects and run their Describe method
     * @return String starting with [ end with ] which each desciption seperated by a comma
     *
     */
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

    /**
     * Helper method to add to Descrive List
     * @param describe The describe object to add
     * @return boolean to indicate if add was successful
     */
    public boolean addToCollection(Describe describe)
    {
        return this.describeList.add(describe);
    }

    /**
     * Getter for describe List
     * @return describeList Test
     */
    public List<Describe> getDescribeList() {
        return describeList;
    }

}
