import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class BackGroundMusicPlayer {
	protected static Clip clip;
	protected boolean clipIsPaused;

	public BackGroundMusicPlayer() {
		Runnable player = new Runnable() {
			@Override
			public void run() {
				try {
					//			possible bug
//					while (true) {

						//		------test start------
						//		Background music shouldBePaused

						System.out.println("Background music play");
						//		------test end------

						play();
//					}

				} catch (Exception exception) {
				}

			}
		};
		new Thread(player).start();
	}
	
	static void play() {

		File song = new File(LocalResources.SongPath);

		try{
			clip = AudioSystem.getClip();
			//		------test start------
			//		Background music shouldBePaused

			System.out.println("Background music start");
			//		------test end------

//			possible bug

			clip.open(AudioSystem.getAudioInputStream(song));
//			clip.start();
//			Thread.sleep(clip.getMicrosecondLength()/1000);

			clip.start();
			clip.loop(Clip.LOOP_CONTINUOUSLY);

		}
		catch(Exception e){
			System.out.println("Not Found");
		}
	}

	public void pause(boolean shouldBePaused){

		//		------test start------
		//		Background music shouldBePaused

		System.out.println("Background music shouldBePaused:"+shouldBePaused);

		//		------test end------

		if(shouldBePaused){
			clip.stop();
			return;
		}
		clip.start();
	}
}


