package java9_to_17.new_NPE;

public class new_npe {

    public static void main(String[] args) {

        Person person1 = new Person("Mehrdad", 34);
        System.out.println(person1.getName().toLowerCase());

//        Person person2 = new Person(null, 34);
//        System.out.println(person2.getName().toLowerCase());
// JDK 14
        Person person3 = null;
        System.out.println(person3.getName().toLowerCase());
    }
}
