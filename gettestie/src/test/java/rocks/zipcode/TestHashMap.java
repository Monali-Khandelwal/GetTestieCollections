package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    HashMap<Person, Address> personAddressMap = new HashMap<>();
    Person person1 = new Person("Cathy", 1971);
    Person person2 = new Person("Marry", 1988);
    Address home = new Address("163 Green Street", "New Jersey", "07302", "USA");
    Address home2 = new Address("100 Orange Street", "Wilmington", "04001", "USA");


    @Test
    public void putTest() {
        //Given: Above

        //When:
        personAddressMap.put(person1, home);
        Address expected = home;
        Address actual = personAddressMap.get(person1);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sizeTest() {
        //Given:
        personAddressMap.put(person1, home);
        personAddressMap.put(person2, home2);

        //When:
        int expected = 2;
        int actual = personAddressMap.size();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsKeyTest() {
        //Given:
        personAddressMap.put(person1, home);
        personAddressMap.put(person2, home2);

        //When:
        boolean expected = true;
        boolean actual = personAddressMap.containsKey(person2);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsKeyFalseTest() {
        //Given:
        personAddressMap.put(person1, home);
        personAddressMap.put(person2, home2);
        Person person3 = new Person("Nyra", 2016);

        //When:
        boolean expected = false;
        boolean actual = personAddressMap.containsKey(person3);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsValueTest1() {
        //Given:
        personAddressMap.put(person1, home);
        personAddressMap.put(person2, home2);

        //When:
        boolean expected = true;
        boolean actual = personAddressMap.containsValue(home);

        //Then:
        Assert.assertEquals(expected, actual);
    }

        @Test
        public void containsValueTest2() {
            //Given:
            personAddressMap.put(person1, home);
            personAddressMap.put(person2, home2);

            //When:
            boolean expected = true;
            boolean actual = personAddressMap.containsValue(home2);

            //Then:
            Assert.assertEquals(expected, actual);
        }

    @Test
    public void getTest() {
        //Given:
        personAddressMap.put(person1, home);
        personAddressMap.put(person2, home2);

        //When:
        Address expected = home2;
        Address actual = personAddressMap.get(person2);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTrueTest() {
        //Given: Above

        //When:
        boolean expected = true;
        boolean actual = personAddressMap.isEmpty();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyFalseTest() {
        //Given:
        personAddressMap.put(person1, home);
        personAddressMap.put(person2, home2);

        //When:
        boolean expected = false;
        boolean actual = personAddressMap.isEmpty();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void keySetTest() {
        //Given:
        personAddressMap.put(person1, home);
        personAddressMap.put(person2, home2);

        //When:
        Set<Person> actual = personAddressMap.keySet();

        //Then:
        Assert.assertTrue(actual.contains(person2) && actual.contains(person1));
    }

    @Test
    public void valueSetTest() {
        //Given:
        personAddressMap.put(person1, home);
        personAddressMap.put(person2, home2);

        //When:
        Collection<Address> actual = personAddressMap.values();

        //Then:
        Assert.assertTrue(actual.contains(home) && actual.contains(home2));
    }

    @Test
    public void removeTest() {
        //Given:
        personAddressMap.put(person1, home);
        personAddressMap.put(person2, home2);

        //When:
        personAddressMap.remove(person1);

        //Then:
        Assert.assertTrue(personAddressMap.size() == 1);
    }

}




