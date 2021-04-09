package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    Set<Person> personTreeSet = new TreeSet<>();
    Person person1 = new Person("Cathy", 1971);
    Person person2 = new Person("Marry", 1988);

    @Test
    public void addTest() {
        //Given: Above

        //When:
        personTreeSet.add(person1);

        //Then:
        Assert.assertTrue(personTreeSet.contains(person1));
    }

    @Test
    public void clearTest() {
        //Given:
        personTreeSet.add(person1);
        personTreeSet.add(person2);

        //When:
        personTreeSet.clear();

        //Then:
        Assert.assertTrue(personTreeSet.isEmpty());
    }

    @Test
    public void containsTest() {
        //Given:
        personTreeSet.add(person1);
        personTreeSet.add(person2);

        //When:
        boolean expected = true;
        boolean actual = personTreeSet.contains(person1);

        //Then:
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void sizeTest() {
//        //Given:
//        personTreeSet.add(person1);
//        //System.out.println(personTreeSet);
//        personTreeSet.add(person2);
//        System.out.println(personTreeSet);
//
//        //When:
//        int expected = 2;
//        int actual = personTreeSet.size();
//
//        //Then:
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void removeTest() {
        //Given:
        personTreeSet.add(person1);
        personTreeSet.add(person1);

        //When:
        personTreeSet.remove(person1);

        //Then:
        Assert.assertFalse(personTreeSet.contains(person1));
    }
}
