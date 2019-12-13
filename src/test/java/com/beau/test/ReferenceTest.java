package com.beau.test;

import org.junit.Test;

public class ReferenceTest {

    @Test
    public void test01() {
        Person p = new Person();
        p.name = "lisi";
        anotherPerson(p);
        System.out.println(p.name);
    }

    @Test
    public void test02() {
        Person p = new Person();
        p.name = "lisi";
        alertPerson(p);
        System.out.println(p.name);
    }

    public void anotherPerson(Person p) {
        p = new Person();
        p.name = "zhangshan";
    }

    public void alertPerson(Person p) {
        p.name = "zhangshan";
    }

    public static class Person {
        public String name;
        public String age;
    }
}
