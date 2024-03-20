package com.linus.api.common;

import java.io.IOException;
import java.util.Map;

public abstract class AbstractRepository {
    public abstract Map<String, ?> save(Map<String, ?> paramMap) throws IOException;


    public abstract Map<String, ?> save2(Map<String, ?> paramMap2) throws IOException;
}
