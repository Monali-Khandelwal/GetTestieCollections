package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

    TreeMap<Person, Address> personAddressTreeMap = new TreeMap<>();
    Person person1 = new Person("Cathy", 1971);
    Person person2 = new Person("Marry", 1988);
    Address home1 = new Address("163 Green Street", "New Jersey", "07302", "USA");
    Address home2 = new Address("101 Orange Street", "", "07302", "USA");

    @Test
    public void putTest() {
        //Given: Above

        //When:
        personAddressTreeMap.put(person1, home1);
        Address expected = home1;
        Address actual = personAddressTreeMap.get(person1);

        //Then:
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void sizeTest() {
//        //Given:
//        personAddressTreeMap.put(person1, home1);
//        personAddressTreeMap.put(person2, home2);
//
//        //When:
//        int expected = 2;
//        int actual = personAddressTreeMap.size();
//
//        //Then:
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void containsKeyTest() {
        //Given:
        personAddressTreeMap.put(person1, home1);
        personAddressTreeMap.put(person2, home2);

        //When:
        boolean expected = true;
        boolean actual = personAddressTreeMap.containsKey(person2);

        //Then:
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void containsKeyFalseTest() {
//        //Given:
//        personAddressTreeMap.put(person1, home1);
//        personAddressTreeMap.put(person2, home2);
//        Person person3 = new Person("Neysa", 2001);
//
//        //When:
//        boolean expected = false;
//        boolean actual = personAddressTreeMap.containsKey(person3);
//
//        //Then:
//        Assert.assertEquals(expected, actual);
//    }

//    @Test
//    public void containsValueTest() {
//        //Given:
//        personAddressTreeMap.put(person1, home1);
//        personAddressTreeMap.put(person2, home2);
//
//        //When:
//        boolean expected = true;
//        boolean actual = personAddressTreeMap.containsValue(home1);
//
//        //Then:
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void containsValue2Test() {
        //Given:
        personAddressTreeMap.put(person1, home1);
        personAddressTreeMap.put(person2, home2);

        //When:
        boolean expected = true;
        boolean actual = personAddressTreeMap.containsValue(home2);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        //Given:
        personAddressTreeMap.put(person1, home1);
        personAddressTreeMap.put(person2, home2);

        //When:
        Address expected = home2;
        Address actual = personAddressTreeMap.get(person2);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTrueTest() {
        //Given: Above

        //When:
        boolean expected = true;
        boolean actual = personAddressTreeMap.isEmpty();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyFalseTest() {
        //Given:
        personAddressTreeMap.put(person1, home1);
        personAddressTreeMap.put(person2, home2);

        //When:
        boolean expected = false;
        boolean actual = personAddressTreeMap.isEmpty();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void keySetTest() {
        //Given:
        personAddressTreeMap.put(person1, home1);
        personAddressTreeMap.put(person2, home2);

        //When:
        Set<Person> actual = personAddressTreeMap.keySet();

        //Then:
        Assert.assertTrue(actual.contains(person2) && actual.contains(person1));
    }

//    @Test
//    public void valueSetTest() {
//        //Given:
//        personAddressTreeMap.put(person1, home1);
//        personAddressTreeMap.put(person2, home2);
//
//        //When:
//        Collection<Address> actual = personAddressTreeMap.values();
//
//        //Then:
//        Assert.assertTrue(actual.contains(home1) && actual.contains(home2));
//    }

//    @Test
//    public void removeTest() {
//        //Given:
//        personAddressTreeMap.put(person1, home1);
//        personAddressTreeMap.put(person2, home2);
//
//        //When:
//        personAddressTreeMap.remove(person1);
//
//        //Then:
//        Assert.assertTrue(personAddressTreeMap.size() == 1);
//    }

}
