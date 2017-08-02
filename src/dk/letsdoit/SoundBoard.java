package dk.letsdoit;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;


public class SoundBoard implements Commons {

    private AudioClip playerShoot;
    private AudioClip alienKilled;

    public SoundBoard() {
        URL playerShootUrl = SoundBoard.class.getResource("/sounds/shoot.wav");
        URL alienKilledUrl = SoundBoard.class.getResource("/sounds/invaderkilled.wav");
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
