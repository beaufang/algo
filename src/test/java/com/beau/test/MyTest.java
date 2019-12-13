package com.beau.test;

import com.beau.common.Fib;
import org.junit.Test;

public class MyTest {

    @Test
    public void test01() {
        Fib fib = new Fib(6);
        System.out.println(fib.get());
        System.out.println(fib.next());
        System.out.println(fib.prev());
    }

    @Test
    public void test02() {
        char a = 'a';
        Character c = new Character('a');
        System.out.println(a == c);
    }

}
