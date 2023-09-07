package java18_to_21.parttern_matching.with_switch;



public class PatternMatchingSwitch {

    public void traditionalPrint(Object o) {
        switch (o) {
            case Position p -> System.out.printf("o is a position: %d/%d%n", p.x(), p.y());
            case String s -> System.out.printf("o is a string: %s%n", s);
            default -> System.out.printf("o is something else: %s%n", o);
        }
    }

    public void print(Object o) {
        switch (o) {
            case Position(int x, int y) -> System.out.printf("o is a position: %d/%d%n", x, y);
            case String s           -> System.out.printf("o is a string: %s%n", s);
            default                 -> System.out.printf("o is something else: %s%n", o);
        }
    }

    public static void main(String[] args) {

        PatternMatchingSwitch pms = new PatternMatchingSwitch();
        pms.print(new Position(100, 200));
        pms.print("Hello");
    }
}
