package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

    @Test
    public void addTest (){

        Deque<Person> deq = new ArrayDeque<>();

        Person surb = new Person("Surabhi",1998);
        Person alopa = new Person("Alopa",2001);
        Person danish = new Person("Danish",1990);
        Person sapna = new Person("Sapna",1970);

        deq.add(surb);
        deq.add(alopa);
        deq.add(danish);
        deq.add(sapna);

        int expectect =4;
        int actual = deq.size();

        Assert.assertEquals(expectect,actual);

    }

    @Test
    public void peekLast (){

        Deque<Person> deq = new ArrayDeque<>();

        Person surb = new Person("Surabhi",1998);
        Person alopa = new Person("Alopa",2001);
        Person danish = new Person("Danish",1990);
        Person sapna = new Person("Sapna",1970);

        deq.add(surb);
        deq.add(alopa);
        deq.add(danish);
        deq.add(sapna);

        Person expected = sapna;
        Person actual = deq.peekLast();


        Assert.assertEquals(expected,actual);

    }

    @Test
    public void pollFirst (){

        Deque<Person> deq = new ArrayDeque<>();

        Person surb = new Person("Surabhi",1998);
        Person alopa = new Person("Alopa",2001);
        Person danish = new Person("Danish",1990);
        Person sapna = new Person("Sapna",1970);

        deq.add(surb);
        deq.add(alopa);
        deq.add(danish);
        deq.add(sapna);

         deq.pollFirst();

         int actual = deq.size();
         int expected = 3;

        Assert.assertEquals(expected,actual);

    }

}
