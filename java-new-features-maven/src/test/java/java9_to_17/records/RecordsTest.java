package java9_to_17.records;

import org.junit.jupiter.api.Test;

public class RecordsTest {

    @Test
    public void recordsExample() {

        Person person1 = new Person("Buffon", 45);
        PersonRecord person2 = new PersonRecord("Buffon", 45);

        System.out.println(person1.getAge());
        System.out.println(person2.age());
    }
}
