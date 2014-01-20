package com.github.plaufer1980.java.migration.playground;

import junit.framework.TestCase;

public class Java6FooTest extends TestCase {

    public void testSomething() {
        Java6Foo foo = new Java6Foo();
        foo.bar();
        assert(true);
    }

}
