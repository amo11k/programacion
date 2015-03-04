package ejemplos;


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class PlaySong {
	public static void main(String args[]) {
		try {
			AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File("spring.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInput);
			clip.start();
			Thread.sleep(3000);
		} catch(Exception ex) {
			System.out.println("Error playing sound.");
					ex.printStackTrace();
		}
	}
}


