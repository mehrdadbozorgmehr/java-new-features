package java9_to_17.text_blocks;

import org.junit.jupiter.api.Test;

public class TextBlocksTest {

    @Test
    void oldMultilineTexts() {

        String json = "{\"name\": \"painter\", \"qty\": 18, "
                + "\"size\": {\"width\": 1, \"height\": 8, \"unit\": \"in\"},"
                + "\"tags\": [\"writing\", \"pen\"],"
                + "\"rating\": 7}";
        System.out.println(json);
    }

    @Test
    void textBlocks() {

        String json = """
                {
                 "name": "painter", "qty": 18,
                 "size": {"width": 1, "height": 8, "unit": "in"},
                 "tags": ["writing", "pen"],
                 "rating": 7
                }
                """;
        System.out.println(json);
    }
}
