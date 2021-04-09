package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    ArrayList<Person> personList = new ArrayList<>();
    Person person1 = new Person("Cathy", 1971);
    Person person2 = new Person("Marry", 1988);


    @Test
    public void testAdd() {
        //Given:
        ArrayList<String> arrayList = new ArrayList<>();

        //When:
        arrayList.add("Zipcode");

        //Then:
        Assert.assertTrue(arrayList.get(0).equals("Zipcode"));
    }

    @Test
    public void testIndexAdd() {
        //Given:
        personList.add(person1);
        personList.add(person2);
        Person person3 = new Person("Sandy", 1980);

        //When:
        personList.add(0, person3);

        //Then:
        Assert.assertSame(personList.get(0), person3);
    }

    @Test
    public void testAddAll() {
        //Given:
        Person[] personArray = new Person[] {person1, person2};

        //When:
        personList.addAll(Arrays.asList(personArray));

        //Then:
        Assert.assertTrue(personList.size() == 2);
    }

    @Test
    public void testAddAllIndex() {
        //Given:
        personList.add(person1);
        personList.add(person2);
        Person[] personArray = new Person[] {person1, person2};

        //When:
        personList.addAll(1, Arrays.asList(personArray));
        Person expected = person1;
        Person actual = personList.get(1);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testClear() {
        //Given:
        personList.add(person1);
        personList.add(person2);

        //When:
        personList.clear();

        //Then:
        Assert.assertTrue(personList.isEmpty());
    }

    @Test
    public void testContains() {
        //Given:
        personList.add(person1);
        personList.add(person2);

        //When:
        boolean expected = true;
        boolean actual = personList.contains(person2);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
        //Given:
        personList.add(person1);
        personList.add(person2);

        //When:
        String expected = "Cathy";
        String actual = personList.get(0).getName();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIndexOf() {
        //Given:
        personList.add(person1);
        personList.add(person2);

        //When:
        int expected = 1;
        int actual = personList.indexOf(person2);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        //Given:
        personList.add(person1);
        personList.add(person2);

        //When:
        personList.remove(person1);

        //Then:
        Assert.assertFalse(personList.contains(person1));
    }

    @Test
    public void testRemoveAll() {
        //Given:
        personList.add(person1);
        personList.add(person2);
        Person[] personArray = new Person[] {person1, person2};

        //When:
        personList.removeAll(Arrays.asList(personArray));

        //Then:
        Assert.assertTrue(personList.isEmpty());
    }

    @Test
    public void testSize() {
        //Given:
        personList.add(person1);
        personList.add(person2);

        //When:
        int expected = 2;
        int actual = personList.size();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSet() {
        //Given:
        personList.add(person1);
        personList.add(person2);

        //When:
        personList.set(1, person1);

        //Then:
        Assert.assertSame(personList.get(1), person1);
    }
}
