package com.finch.aj;

import java.io.IOException;
import java.util.Iterator;

public interface Processor {

    void process(Iterator<String> it) throws IOException;
}
