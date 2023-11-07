package java9_to_17.new_switch;

import org.junit.jupiter.api.Test;

public class EnhanceSwitchStatementTest {

    @Test
    void SwitchExample() {
        String player = "Messi";

        runSwitch(player);
    }

    private void runSwitch(String player) {

        switch (player) {
            case "Muller", "Neuer" -> System.out.println("Bayern");
            case "Messi" -> System.out.println("Miami");
            case "Ronaldo" -> System.out.println("Al Nassr");
            default -> System.out.println("i dont know this player.");
        }
    }
}
