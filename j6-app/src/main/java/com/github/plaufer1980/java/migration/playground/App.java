package com.github.plaufer1980.java.migration.playground;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Java6Foo java6Foo = new Java6Foo();
        java6Foo.bar();

        Java7Foo java7Foo = new Java7Foo();
        java7Foo.bar();
    }
}
