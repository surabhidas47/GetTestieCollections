package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    //are synchronized by default, meaning its thread safe as opposed
    //to arraylist, not thread safe

    @Test
    public void testAdd () {

        Vector<Integer> voop = new Vector<>();

        voop.add(3);
        voop.add(2);
        voop.add(5);
        voop.add(6);
        int expected = 4;
        int actual = voop.size();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testFirst () {

        Vector<Integer> voop = new Vector<>();

        voop.add(3);
        voop.add(2);
        voop.add(5);
        voop.add(6);
        int expected = 3;
        int actual = voop.firstElement();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testSetandGet() {

        Vector<Integer> voop = new Vector<>();

        voop.add(3);
        voop.add(2);
        voop.add(5);
        voop.add(6);

        voop.set(1,9);
        int expected = 9;
        int actual = voop.get(1);

        Assert.assertEquals(expected,actual);

    }





}
