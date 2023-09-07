package java9_to_17.instance_of;

import org.junit.jupiter.api.Test;

public class InstanceOfExampleTest {

    @Test
    void instanceOfExample() {

        AbstractMediaFile abstractMediaFile = new MusicMediaFile();
        useInstanceOf(abstractMediaFile);
    }

    private void useInstanceOf(AbstractMediaFile abstractMediaFile) {
        //before
        if (abstractMediaFile instanceof MusicMediaFile) {

            ((MusicMediaFile) abstractMediaFile).playMusic();
        }

        //JDK 16 Introduced Pattern matching for
        if (abstractMediaFile instanceof MusicMediaFile musicFile) {

            musicFile.playMusic();
        }
    }
}
