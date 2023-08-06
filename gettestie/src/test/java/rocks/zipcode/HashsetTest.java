package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HashsetTest {



    @Test
    public void addTest () {

        Set<Integer> testset = new HashSet<>();

        testset.add(1);
        testset.add(1);
        testset.add(1);
        testset.add(2);
        testset.add(3);
        testset.add(4);
        testset.add(5);

        int expected = 5;
        int actual = testset.size();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getTest () {

        //given
        Set<Person> testset = new HashSet<>();

        Person surb = new Person("Surabhi", 2003);
        Person alopa = new Person("Alopa", 1970);

        //then

        String expected = "Surabhi";
        String actual = surb.getName();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void clearTest () {

        Set<Integer> testset = new HashSet<>();


        testset.add(1);
        testset.add(1);
        testset.add(1);
        testset.add(2);
        testset.add(3);
        testset.add(4);
        testset.add(5);

        //when
        testset.clear();

        Assert.assertTrue(testset.isEmpty());

    }


    @Test
    public void containsTest () {

        Set<Integer> testset = new HashSet<>();


        testset.add(1);
        testset.add(1);
        testset.add(1);
        testset.add(2);
        testset.add(3);
        testset.add(4);
        testset.add(5);



        Assert.assertTrue(testset.contains(4));

    }

}
