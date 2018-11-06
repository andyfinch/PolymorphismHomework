package com.finch.aj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: finchaj
 * Date: 06/11/2018
 * Time: 09:52
 */

public class StubIterator implements Iterator<String> {

    List<String> stringList = new ArrayList<>();
    private int currentIndex = 0;

    public StubIterator(String ...stringsToAdd) {

        stringList.addAll(Arrays.asList(stringsToAdd));

    }

    @Override
    public boolean hasNext() {
        return currentIndex < stringList.size();
    }

    @Override
    public String next() {
        return stringList.get(currentIndex++);
    }
}
