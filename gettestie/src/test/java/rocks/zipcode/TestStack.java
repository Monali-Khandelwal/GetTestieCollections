package rocks.zipcode;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
    Stack<Person> personStack = new Stack<>();
    Stack<Address> addressStack = new Stack<>();
    Person person1 = new Person("Cathy", 1971);
    Person person2 = new Person("Marry", 1988);
    Address home = new Address("163 Green Street", "New Jersey", "07302", "USA");

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....


    @Test
    public void testIsEmptyTrue() {
        //Given:
        Stack<String> stack = new Stack<>();

        //When:
        boolean expected = true;
        boolean actual = stack.isEmpty();

        //Then:
        assertEquals(expected, actual);
    }

    /**
     * empty() returns true if and only if this stack contains no items; otherwise false
     */

    @Test
    public void testIsEmptyFalse() {
        //Given:
        personStack.push(person1);

        //When:
        boolean expected = false;
        boolean actual = personStack.empty();

        //Then:
        assertEquals(expected, actual);
    }

    @Test
    public void testAdd() {
        //Given:
        personStack.add(person1);
        personStack.add(person2);

        //When:
        int expected = 2;
        int actual = personStack.size();

        //Then:
        assertEquals(expected, actual);

    }

    /**
     * peek() Looks at the object at the top of this stack without removing it from the stack
     */

    @Test
    public void testPeak() {
        //Given:
        personStack.add(person1);
        personStack.add(person2);

        //When:
        Person expected = person2;
        Person actual = personStack.peek();

        //Then:
        assertEquals(expected, actual);

    }


    @Test
    public void testPush() {
        //Given:
        personStack.add(person1);

        //When:
        personStack.push(person2);
        Person expected = person2;
        Person actual = personStack.peek();

        //Then:
        assertEquals(expected, actual);
    }

    /**
     * pop() Removes the object at the top of this stack and
     * returns that object as the value of this function.
     */
    @Test
    public void testPop() {
        //Given:
        personStack.push(person1);
        personStack.push(person2);

        //When:
        Person expected = person2;
        Person actual = personStack.pop();

        //Then:
        assertEquals(expected, actual);
    }

    @Test
    public void testPopSize() {
        //Given:
        personStack.push(person1);
        personStack.push(person2);

        //When:
        personStack.pop();
        int expected = 1;
        int actual = personStack.size();

        //Then:
        assertEquals(expected, actual);
    }

    /**
     * the 1-based position from the top of the stack where the object is located;
     * the return value -1 indicates that the object is not on the stack.
     */
    @Test
    public void testSearch() {
        //Given:
        personStack.push(person1);
        personStack.push(person2);

        //When:
        int expected = 2;
        int actual = personStack.search(person1);

        //Then:
        assertEquals(expected, actual);
    }
}






