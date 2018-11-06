package com.finch.aj;

import java.io.IOException;
import java.util.Iterator;

/**
 * Interface to allow processing of an Iterator
 */
public interface Processor {

    /**
     * Iterator can be processed
     * @param stringIterator The Iterator to process
     * @throws IOException Exception if error in processing
     */
    void process(Iterator<String> stringIterator) throws IOException;
}
