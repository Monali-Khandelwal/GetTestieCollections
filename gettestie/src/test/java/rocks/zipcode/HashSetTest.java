package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    Set<Person> personHashSet = new HashSet<>();
    Person person1 = new Person("Cathy", 1971);
    Person person2 = new Person("Marry", 1988);

    @Test
    public void addTest() {
        //Given:
        Set<String> hashset = new HashSet<>();

        //When:
        hashset.add("Zipcode Wilmington");

        //Then:
        Assert.assertFalse(hashset.isEmpty());
    }

    /**
     * Returns true if this set contains the specified element.
     */
    @Test
    public void containsTest() {
        //Given:
        personHashSet.add(person1);
        personHashSet.add(person2);

        //When:
        boolean expected = true;
        boolean actual = personHashSet.contains(person1);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    /**
     * Removes all of the elements from this set. The set will be empty after this call returns.
     */
    @Test
    public void clearTest() {
        //Given:
        personHashSet.add(person1);
        personHashSet.add(person2);

        //When:
        personHashSet.clear();

        //Then:
        Assert.assertTrue(personHashSet.isEmpty());
    }

    /**
     * Returns the number of elements in this set
     */

    @Test
    public void sizeTest() {
        //Given:
        personHashSet.add(person1);
        personHashSet.add(person2);

        //When:
        int expected = 2;
        int actual = personHashSet.size();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    /**
     *  Removes the specified element from this set if it is present.
     */
    @Test
    public void removeTest() {
        //Given:
        personHashSet.add(person1);
        personHashSet.add(person2);

        //When:
        personHashSet.remove(person1);

        //Then:
        Assert.assertFalse(personHashSet.contains(person1));
    }


}
