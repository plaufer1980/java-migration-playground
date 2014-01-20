package com.github.plaufer1980.java.migration.playground;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java7Foo {

    public void bar() {
        try {
            // Java 7: Diamond Operator
            Map<String, List<String>> map = new HashMap<>();
            map.put("foo", new ArrayList<String>());
            Integer.parseInt("baz");

        } catch (IllegalStateException | NumberFormatException e) {
            // Java 7: Multi-catch Exception Handling

        }
    }

}
