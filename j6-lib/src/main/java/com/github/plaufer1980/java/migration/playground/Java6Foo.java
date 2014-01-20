package com.github.plaufer1980.java.migration.playground;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Java6Foo {

    public void bar() {

    }

// uncomment the block below to see the maven-compiler-plugin (and your IDE) complain about JDK 1.7 features
//    public void baz() {
//        try {
//            // Java 7: Diamond Operator
//            Map<String, List<String>> map = new HashMap<>();
//            map.put("foo", new ArrayList<String>());
//            Integer.parseInt("baz");
//
//        } catch (IllegalStateException | NumberFormatException e) {
//            // Java 7: Multi-catch Exception Handling
//
//        }
//    }

}
