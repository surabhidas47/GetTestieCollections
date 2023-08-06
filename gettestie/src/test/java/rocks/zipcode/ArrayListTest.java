package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest <T> {

    ArrayList<T> testArray = new ArrayList<T>();
    @Test
    public void testAdd (){

        //given

        Person surb = new Person("Surabhi",1998);
        Person alopa = new Person("Alopa",2001);

        //when
        int expected = 2;
        testArray.add((T) surb);
        testArray.add((T) alopa);

        //then

        Assert.assertEquals(expected,testArray.size());

    }

    @Test
    public void testIndex (){

        //given

        Person surb = new Person("Surabhi",1998);
        Person alopa = new Person("Alopa",2001);

        //when
        int expected = 1;
        testArray.add((T) surb);
        testArray.add((T) alopa);

        //then

        Assert.assertEquals(expected,testArray.indexOf(alopa));

    }

    @Test
    public void testGetName (){
        //given

        Person surb = new Person("Surabhi",1998);
        Person alopa = new Person("Alopa",2001);
        String expected = "Surabhi";

        //when
        testArray.add((T) surb);
        testArray.add((T) alopa);

        String actual = surb.getName();

        //then

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testSetYear (){
        //given

        Person surb = new Person("Surabhi",1998);
        Person alopa = new Person("Alopa",2001);

        //when
        int expected = 1800;

        testArray.add((T) surb);
        testArray.add((T) alopa);


        alopa.setYearOfBirth(1800);

        //then

        Assert.assertEquals(expected,alopa.getYearOfBirth());

    }


}
