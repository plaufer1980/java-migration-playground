package com.github.plaufer1980.java.migration.playground;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Java6Foo java6Foo = new Java6Foo();
        java6Foo.bar();

        Java7Foo java7Foo = new Java7Foo();
        java7Foo.bar();

        assertTrue( true );
    }
}
