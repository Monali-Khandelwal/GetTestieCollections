package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    PriorityQueue<Person> personPriorityQueue = new PriorityQueue<>();
    Person person1 = new Person("Cathy", 1971);
    Person person2 = new Person("Marry", 1988);

    @Test
    public void addTest() {
        //Given: Above

        //When:
        personPriorityQueue.add(person1);

        //Then:
        Assert.assertTrue(personPriorityQueue.contains(person1));
    }

    @Test
    public void peakTest() {
        //Given: Above

        //When:
        Person expected = null;
        Person actual = personPriorityQueue.peek();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void peakWithPersonAddedTest() {
        //Given:
        personPriorityQueue.add(person1);

        //When:
        Person expected = person1;
        Person actual = personPriorityQueue.peek();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void offerTest() {
        //Given:
        personPriorityQueue.add(person1);

        //When:
        personPriorityQueue.offer(person2);

        //Then:
        Assert.assertTrue(personPriorityQueue.contains(person2));
    }

    @Test
    public void clearTest() {
        //Given:
        personPriorityQueue.add(person1);

        //When:
        personPriorityQueue.clear();

        //Then:
        Assert.assertTrue(personPriorityQueue.isEmpty());
    }

    @Test
    public void sizeTest() {
        //Given:
        personPriorityQueue.add(person1);

        //When:
        personPriorityQueue.offer(person1);

        //Then:
        Assert.assertTrue(personPriorityQueue.size() == 2);
    }

    @Test
    public void pollTest() {
        //Given:
        personPriorityQueue.add(person1);
        personPriorityQueue.offer(person2);

        //When:
        Person actual = personPriorityQueue.poll();

        //Then:
        Assert.assertTrue(actual == person1);
    }
}
