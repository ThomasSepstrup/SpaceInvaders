package dk.letsdoit;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;


public class SoundBoard implements Commons {

    private AudioClip playerShoot;
    private AudioClip alienKilled;

    public SoundBoard() {
        URL playerShootUrl = SoundBoard.class.getResource(PLAYER_SHOT_SOUND);
        URL alienKilledUrl = SoundBoard.class.getResource(ALIEN_KILLED_SOUND);

        playerShoot = Applet.newAudioClip(playerShootUrl);
        alienKilled = Applet.newAudioClip(alienKilledUrl);


    }

    public void playPlayerShotSound() {
        playerShoot.play();
    }

    public void playAlienKilledSound() {
        alienKilled.play();
    }
}
