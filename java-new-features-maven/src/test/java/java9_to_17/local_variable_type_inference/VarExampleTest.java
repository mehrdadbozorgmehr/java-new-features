package java9_to_17.local_variable_type_inference;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VarExampleTest {


    int i = 10;

    @Test
    public void varExample() {

        // Java 5
        List<String> names = new ArrayList<String>();

        // Java 7
        List<String> names2 = new ArrayList<>();

        // local variable type inference - Java 10
        var names3 = new ArrayList<String>();

        var i = 10;
        var name = "Del Piero"; // String pool

        var anotherName = new String("Ronaldo");

        // Backward compatibility
        var var = "Messi";


        assertEquals(ArrayList.class, names.getClass());
        assertEquals(ArrayList.class, names2.getClass());
        assertEquals(ArrayList.class, names3.getClass());
        assertEquals(String.class, name.getClass());
        assertEquals(String.class, anotherName.getClass());
        assertEquals(String.class, var.getClass());
    }

    @Test
    public void testPerson() {
        var person = new Person("John", 30);

        assertEquals("John", person.getName());
        assertEquals(30, person.getAge());
    }
}
