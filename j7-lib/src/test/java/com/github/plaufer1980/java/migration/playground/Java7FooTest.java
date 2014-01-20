package com.github.plaufer1980.java.migration.playground;

import junit.framework.TestCase;

public class Java7FooTest extends TestCase {

    public void testSomething() {
        Java7Foo foo = new Java7Foo();
        foo.bar();
        assert(true);
    }

}
