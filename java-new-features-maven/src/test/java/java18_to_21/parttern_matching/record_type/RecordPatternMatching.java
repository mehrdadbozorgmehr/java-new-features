package java18_to_21.parttern_matching.record_type;

//@formatter:off

//@formatter:on

public class RecordPatternMatching {

    public static void main(String[] args) {
        Human personRecord = new TeacherRecord("John", 30);
        Human studentRecord = new StudentRecord("Mehrdad", 30);
        System.out.println(personRecord);
        System.out.println(studentRecord);
        processCheckHuman(personRecord);
    }

    private static void processCheckHuman(Human personRecord) {
        // traditional
        if (personRecord instanceof TeacherRecord p) {

            String name = p.name();
            int age = p.age();
            System.out.println("name: " + name + ", age: " + age);
        }

        // record pattern matching with new way
        if (personRecord instanceof TeacherRecord(String name, int age)) {

            System.out.println("name: " + name + ", age: " + age);
        }
    }
}
