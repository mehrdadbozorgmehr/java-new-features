package java9_to_17.records;

public record PersonRecord(String name, int age) {
    public  boolean isYoung()
    {
     return  age<50;
    }

}
