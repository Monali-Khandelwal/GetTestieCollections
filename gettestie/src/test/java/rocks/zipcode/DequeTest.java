package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeTest {

    Deque<Person> personDeque = new ArrayDeque<>();
    Person person1 = new Person("Cathy", 1971);
    Person person2 = new Person("Marry", 1988);

    @Test
    public void addTest() {
        //Given: Above

        //When:
        personDeque.add(person1);

        //Then:
        Assert.assertTrue(personDeque.contains(person1));
    }

    @Test
    public void addFirstTest() {
        //Given:
        personDeque.add(person1);
        personDeque.add(person2);
        Person person3 = new Person("Lena", 1992);

        //When:
        personDeque.addFirst(person3);

        //Then:
        Assert.assertSame(personDeque.getFirst(), person3);
    }

    @Test
    public void addLastTest() {
        //Given:
        personDeque.add(person1);
        personDeque.add(person2);
        Person mike = new Person("Mike", 1992);

        //When:
        personDeque.addLast(mike);

        //Then:
        Assert.assertSame(personDeque.getLast(), mike);
    }

    @Test
    public void isEmptyTrueTest() {
        //Given:
        Person mike = new Person("Mike", 1992);

        //When:
        boolean expected = true;
        boolean actual = personDeque.isEmpty();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmptyFalseTest() {
        //Given:
        personDeque.add(person1);

        //When:
        boolean expected = false;
        boolean actual = personDeque.isEmpty();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void offerTest() {
        //Given:
        personDeque.add(person1);
        personDeque.add(person2);
        Person person3 = new Person("Susana", 1990);

        //When:
        personDeque.offer(person3);

        //Then:
        Assert.assertSame(personDeque.getLast(), person3);
    }

    @Test
    public void remove() {
        //Given:
        personDeque.add(person1);
        personDeque.add(person2);

        //When:
        personDeque.remove(person1);

        //Then:
        Assert.assertFalse(personDeque.contains(person1));
    }

    @Test
    public void sizeTest() {
        //Given:
        personDeque.add(person1);
        personDeque.add(person2);
        Person person3 = new Person("Maggie", 1987);

        //When:
        personDeque.addLast(person3);
        int expected = 3;
        int actual = personDeque.size();

        //Then:
        Assert.assertEquals(expected, actual);
    }

}
