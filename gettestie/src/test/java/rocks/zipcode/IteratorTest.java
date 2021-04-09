package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    ArrayList<Person> personArrayList = new ArrayList<>();
    Person person1 = new Person("Cathy", 1991);
    Person person2 = new Person("Marry", 1993);

    @Test
    public void hasNextTest() {
        //Given:
        personArrayList.add(person1);
        personArrayList.add(person2);

        //When:
        Iterator<Person> personIterator = personArrayList.iterator();


        //Then:
        Assert.assertTrue(personIterator.hasNext());
    }

    @Test
    public void nextTest() {
        //Given:
        personArrayList.add(person1);
        personArrayList.add(person2);

        //When:
        Iterator<Person> personIterator = personArrayList.iterator();
        Person nextPerson = personIterator.next();

        Then:
        Assert.assertEquals(person1, nextPerson);
    }

    @Test
    public void removeTest() {
        //Given:
        personArrayList.add(person1);
        personArrayList.add(person2);

        //When:
        Iterator<Person> personIterator = personArrayList.iterator();
        while(personIterator.hasNext()) {
            if(personIterator.next() == person1) {
                personIterator.remove();
            }
        }
        //Then:
        Assert.assertFalse(personArrayList.contains(person1));
    }
}
