import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;

public class BackgroundMusic {
    Clip c;
    @SuppressWarnings("CallToPrintStackTrace")
    void bgMusic() {
        try{
            c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(new File("C:\\Users\\PC\\Desktop\\ICT11_GROUP_10_1\\PIC_PUZZLE 0.2\\Pic-Puzzle-main\\src\\res\\sounds\\Mingle.wav")));

            c.start();
        } catch(LineUnavailableException | IOException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }
    }

    void startMusic() {
        c.start();
    }

    void stopMusic() {
        c.stop();
    }
}

