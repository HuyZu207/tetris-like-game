import javax.sound.sampled.*;
import java.io.File;

public class SFX {
    public static void playSound(String filePath) {
        try {
            File soundPath = new File(filePath);
            if(soundPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
