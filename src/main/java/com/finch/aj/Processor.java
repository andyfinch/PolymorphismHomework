package com.finch.aj;

import java.io.IOException;

public interface Processor {

    void process(Iterable<String> it) throws IOException;
}
