package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TestLinkedList {

    Queue<Person> personQueue = new LinkedList<>();
    Person person1 = new Person("Cathy", 1971);
    Person person2 = new Person("Marry", 1988);

    @Test
    public void testAdd() {
        //Given: Above

        //When:
        personQueue.add(person1);

        //Then:
        Assert.assertTrue(personQueue.contains(person1));
    }


    @Test
    public void testAddAll() {
        //Given:
        Person[] personArray = new Person[] {person1, person2};

        //When:
        personQueue.addAll(Arrays.asList(personArray));

        //Then:
        Assert.assertTrue(personQueue.size() == 2);
    }


    @Test
    public void testClear() {
        //Given:
        personQueue.add(person1);
        personQueue.add(person2);

        //When:
        personQueue.clear();

        //Then:
        Assert.assertTrue(personQueue.isEmpty());
    }

    @Test
    public void testContains() {
        //Given:
        personQueue.add(person1);
        personQueue.add(person2);

        //When:
        boolean expected = true;
        boolean actual = personQueue.contains(person2);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testElement() {
        //Given:
        personQueue.add(person1);
        personQueue.add(person2);

        //When:
        Person expected = person1;
        Person actual = personQueue.element();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPeek() {
        //Given:
        personQueue.add(person1);
        personQueue.add(person2);

        //When:
        Person expected = person1;
        Person actual = personQueue.peek();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        //Given:
        personQueue.add(person1);
        personQueue.add(person2);

        //When:
        personQueue.remove(person1);

        //Then:
        Assert.assertFalse(personQueue.contains(person1));
    }

    @Test
    public void testRemoveAll() {
        //Given:
        personQueue.add(person1);
        personQueue.add(person2);
        Person[] personArray = new Person[] {person1, person2};

        //When:
        personQueue.removeAll(Arrays.asList(personArray));

        //Then:
        Assert.assertTrue(personQueue.isEmpty());
    }

    @Test
    public void testSize() {
        //Given:
        personQueue.add(person1);
        personQueue.add(person2);

        //When:
        int expected = 2;
        int actual = personQueue.size();

        //Then:
        Assert.assertEquals(expected, actual);
    }


}
