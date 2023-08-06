package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Queue;

public class LinkedList {

    @Test
    public void addTest(){

        Queue<Person> linkylist = new java.util.LinkedList<>();

        Person surb = new Person("Surabhi",1998);
        Person alopa = new Person("Alopa",2001);
        Person danish = new Person("Danish",1990);
        Person sapna = new Person("Sapna",1970);

        linkylist.add(surb);
        linkylist.add(alopa);
        linkylist.add(danish);
        linkylist.add(sapna);

        int expected =4;
        int actual  = linkylist.size();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void pollTest(){

        Queue<Person> linkylist = new java.util.LinkedList<>();

        Person surb = new Person("Surabhi",1998);
        Person alopa = new Person("Alopa",2001);
        Person danish = new Person("Danish",1990);
        Person sapna = new Person("Sapna",1970);

        linkylist.add(surb);
        linkylist.add(alopa);
        linkylist.add(danish);
        linkylist.add(sapna);

        linkylist.poll();

        int expected =3;
        int actual  = linkylist.size();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void peekTest(){

        Queue<Person> linkylist = new java.util.LinkedList<>();

        Person surb = new Person("Surabhi",1998);
        Person alopa = new Person("Alopa",2001);
        Person danish = new Person("Danish",1990);
        Person sapna = new Person("Sapna",1970);

        linkylist.add(surb);
        linkylist.add(alopa);
        linkylist.add(danish);
        linkylist.add(sapna);

        linkylist.peek();

        int expected =4;
        int actual  = linkylist.size();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void containsTest(){

        Queue<Person> linkylist = new java.util.LinkedList<>();

        Person surb = new Person("Surabhi",1998);
        Person alopa = new Person("Alopa",2001);
        Person danish = new Person("Danish",1990);
        Person sapna = new Person("Sapna",1970);

        linkylist.add(surb);
        linkylist.add(alopa);
        linkylist.add(danish);
        linkylist.add(sapna);

        Boolean actual  = linkylist.contains(sapna);

        Assert.assertTrue(actual);

    }




}
