package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    HashMap<String,Integer> hashmap = new HashMap<>();
@Test
    public void testAdd(){

    hashmap.put("surabhi",12);
    hashmap.put("surb",14);
    hashmap.put("surby",17);

    int expected = 3;
    int actual = hashmap.size();

    Assert.assertEquals(expected,actual);


}

    @Test
    public void replace(){

        hashmap.put("surabhi",12);
        hashmap.put("surb",14);
        hashmap.put("surby",17);

        hashmap.remove("surb");


        Assert.assertTrue(hashmap.size()==2);

    }

    @Test
    public void contains(){

        hashmap.put("surabhi",12);
        hashmap.put("surb",14);
        hashmap.put("surby",17);



        Assert.assertTrue(hashmap.containsKey("surb"));

    }





}
